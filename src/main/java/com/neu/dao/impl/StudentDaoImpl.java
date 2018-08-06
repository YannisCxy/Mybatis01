package com.neu.dao.impl;

import com.neu.bean.Student;
import com.neu.dao.IStudentDao;
import com.neu.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class StudentDaoImpl implements IStudentDao {
    private SqlSession sqlSession;
    @Override
    public void insertStu(Student stu) {
        try {
//            InputStream inputStream = Resources
//                    .getResourceAsStream("mybatis.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
//                    .build(inputStream);
//            sqlSession = sqlSessionFactory.openSession();
            sqlSession = MyBatisUtils.getSqlSession();
            sqlSession.insert("insertStu", stu);
            sqlSession.commit();
        }
//        catch (IOException e) {
//        }
        finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
