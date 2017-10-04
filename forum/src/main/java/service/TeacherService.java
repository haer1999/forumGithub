package service;

import java.util.List;

import dao.TeacherDao;
import entity.Teacher;

public class TeacherService {
	TeacherDao studentDao = new TeacherDao();
	
	public Teacher select() throws Exception{
		Teacher student = studentDao.select();
		return student;
	}
	
	public List<Teacher> selectAll() throws Exception {
		List<Teacher> list = studentDao.selectAll();
		return list;
	}
	
}
