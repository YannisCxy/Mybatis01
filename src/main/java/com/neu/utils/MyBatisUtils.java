package com.neu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory factory;
    public static SqlSession getSqlSession(){
        try {
            if(factory==null){
                //读主配置文件
                InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
                factory=new SqlSessionFactoryBuilder().build(inputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return factory.openSession();
    }
}