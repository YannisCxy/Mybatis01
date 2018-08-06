package com.neu;

import com.neu.bean.Student;
import com.neu.dao.IStudentDao;
import com.neu.dao.impl.StudentDaoImpl;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private IStudentDao dao;
    @Before
    public void before(){
        dao = new StudentDaoImpl();
    }
    @Test
    public void testInsert(){
        Student stu = new Student("张三",18,95);
        dao.insertStu(stu);
    }
}
