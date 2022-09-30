package net.javaguides.usermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import net.javaguides.usermanagement.model.User;

/**
 * This DAO class provides CRUD database operations for the table employee in
 * the database.
 * 
 * @author Bhaviaka Jiyani
 *
 */
public class UserDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";

	private static final String INSERT_USERS_SQL = "INSERT INTO users"
			+ "  (firstname,lastname,username,address,contact ) VALUES " + " (?,?, ?, ?,?);";

	private static final String SELECT_USER_BY_ID = "select id,firstname,lastname,username,address,contact from users where id =?";
	private static final String SELECT_ALL_USERS = "select * from users ORDER BY id  DESC";
	private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	private static final String UPDATE_USERS_SQL = "update users set firstname = ?,lastname = ?,username = ?,address = ?, contact =? where id = ?;";

	public UserDao() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void insertUser(User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getUserName());
			preparedStatement.setString(4, user.getAddress());
			preparedStatement.setString(5, user.getContactNo());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public User selectAllUser(int id) {
		User user = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				String firstname = resultset.getString("firstname");
				String lastname = resultset.getString("lastname");
				String username = resultset.getString("username");
				String address = resultset.getString("address");
				String contact = resultset.getString("contact");
				user = new User(id, firstname, lastname, username, address, contact);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public List<User> selectAllUsers() {
		List<User> user = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				int id = resultset.getInt("id");
				String firstname = resultset.getString("firstname");
				String lastname = resultset.getString("lastname");
				String username = resultset.getString("username");
				String address = resultset.getString("address");
				String contact = resultset.getString("contact");
				user.add(new User(id, firstname, lastname, username, address, contact));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return user;
	}

	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	public boolean updateUser(User users) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
			statement.setString(1, users.getFirstName());
			statement.setString(2, users.getLastName());
			statement.setString(3, users.getUserName());
			statement.setString(4, users.getAddress());
			statement.setString(5, users.getContactNo());
			statement.setInt(6, users.getId());
			System.out.println(statement);
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}
