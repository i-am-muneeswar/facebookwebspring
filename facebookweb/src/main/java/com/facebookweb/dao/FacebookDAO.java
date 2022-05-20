package com.facebookweb.dao;

import java.sql.*;

import com.facebookweb.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	public int createProfileDAO(FacebookUser fu) {
		
		int i=0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			PreparedStatement ps = con.prepareStatement("insert into facebookweb values(?,?,?,?)");
			ps.setString(1,fu.getName());
			ps.setString(2,fu.getPassword());
			ps.setString(3,fu.getEmail());
			ps.setString(4,fu.getAddress());
			
			i = ps.executeUpdate();
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return i;
		
	}

}
