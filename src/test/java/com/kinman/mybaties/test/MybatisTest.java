package com.kinman.mybaties.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author 谨漫Kinman
 * @version 1.0
 */
public class MybatisTest {

    @Test
    public void testConnection() throws IOException {
        // 核心配置文件classpath路径(源根路径)
        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream reader = Resources.getResourceAsStream(resource);
        // 构建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 从SqlSessionFactory对象中获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession.getConnection());
        // 归还连接给数据源
        sqlSession.close();
    }

}
