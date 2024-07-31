package com.springjdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student2 {
	private String driver;
	private String url;
	private String username;
	private String password;

	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println(" init method ");
		connections();

	}

	@PreDestroy
	public void destroy() throws SQLException {
		System.out.println(" destroy method ");
		conclose();
	}

	public void connections() throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);

	}

	public void fetch() throws ClassNotFoundException, SQLException {

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from Student");
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			System.out.println(id + " " + name + " " + address);

		}

	}

	public void deleteData(int id) throws SQLException, ClassNotFoundException {
		Statement stm = con.createStatement();
		stm.executeUpdate("delete from student where id=" + id);
		System.out.println(" deleted data successfully" + id);

	}

	public void conclose() throws SQLException {
		con.close();
	}
	
}
