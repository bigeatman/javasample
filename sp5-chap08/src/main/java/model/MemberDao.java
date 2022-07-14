package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberDao {

	private JdbcTemplate jdbc;

	public MemberDao(DataSource dataSource) {
		super();
		this.jdbc = new JdbcTemplate(dataSource);
	}

	public void update(Member member) {
		jdbc.update("update MEMBER set NAME=?, PASSWORD=? where EMAIL=?", member.getName(), member.getPassword(),
				member.getEmail());
	}

	public int count() {
		return jdbc.queryForObject("select count(*) from MEMBER", Integer.class).intValue();
	}

	public Collection<Member> selectAll() {
		System.out.println("SELECT ALL");
		return jdbc.query("select * from MEMBER", getRowMapper());
	}

	public Member selectByEmail(String email) {
		List<Member> result = jdbc.query("select * from MEMBER where EMAIL=?", getRowMapper(), email);

		if (result.size() == 0) {
			return null;
		} else {
			return result.get(0);
		}
	}

	private RowMapper<Member> getRowMapper() {
		return new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getTimestamp("REGDATE").toLocalDateTime());
				member.setId(rs.getLong("ID"));
				return member;
			}
		};
	}

	public void insert(Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbc.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(
						"insert into MEMBER(EMAIL, PASSWORD, NAME, REGDATE) values (?, ?, ?, ?)",
						new String[] { "ID" });
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setTimestamp(4, Timestamp.valueOf(member.getRegisterDateTime()));
				return pstmt;
			}
		}, keyHolder);

		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
	}
}
