package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Teacher;

public class TeacherDao {
	public Teacher select() throws Exception{
		Teacher student = new Teacher();
		String sql = "select * from student";
		
		Connection connection = DBUtil.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			student.setSid(resultSet.getInt("id"));
			student.setName(resultSet.getString("name"));
			student.setAge(resultSet.getInt("age"));
			student.setGrade(resultSet.getString("grade"));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return student;
	}
	
	public List<Teacher> selectAll() throws Exception{
		List<Teacher> list = new ArrayList<>();
		String sql = "select * from student";
		
		Connection connection = DBUtil.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			Teacher student = new Teacher();
			student.setSid(resultSet.getInt("id"));
			student.setName(resultSet.getString("name"));
			student.setAge(resultSet.getInt("age"));
			student.setGrade(resultSet.getString("grade"));
			list.add(student);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	
	
}
