package dbquery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.jdbc.pool.DataSource;

public class DbQuery {

	private DataSource dataSource;

	public DbQuery(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public int count() {
		try (Connection conn = dataSource.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select count(*) from MEMBER");
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
