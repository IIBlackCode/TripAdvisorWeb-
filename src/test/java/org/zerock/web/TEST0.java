package org.zerock.web;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class TEST0 {
	
	static Connection conn;

	String mariaDB = "org.mariadb.jdbc.Driver";
//	String mysql = "com.mysql.jdbc.Driver";
	String mysql = "com.mysql.cj.jdbc.Driver";

	private String driver = mariaDB;
	
	private String ip = "192.168.219.190";
	private String port = "3306";
	private String dbName = "book_ex";
	
	private String dataBaseUrl = "jdbc:mysql://"+ip+":"+port+"/"+dbName+"?serverTimezone=UTC";
	private String dataBaseId = "root";
	private String dataBasePw = "1234";

	@Test
	public void test() {
		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(dataBaseUrl, dataBaseId, dataBasePw);
			System.out.println("con : "+conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
