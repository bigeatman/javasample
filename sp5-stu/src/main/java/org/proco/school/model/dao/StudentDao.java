package org.proco.school.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;

import org.proco.school.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao extends DefaultDao<Student> {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public Collection<Student> selectAll() {
		return jdbc.query("select * from Student", getMapper());
	}

	@Override
	public Student selectById(int id) {
		return jdbc.query("select * from Student where id=?", getMapper(), id).get(0);
	}

	@Override
	public boolean insert(Student obj) {
		return false;
	}

	@Override
	public boolean update(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected RowMapper<Student> getMapper() {
		return new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				long id = Long.parseLong(rs.getString("ID"));
				String name = rs.getString("NAME");
				int grade = Integer.parseInt(rs.getString("GRADE"));
				LocalDate date = rs.getTimestamp("BIRTHDAY").toLocalDateTime().toLocalDate();
				return new Student(id, name, date, grade);
			}
		};
	}
}
