package com.kinman.mybaties.test;

import com.kinman.mybatis.mapper.UserMapper;
import com.kinman.mybatis.pojo.User;
import com.kinman.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 谨漫Kinman
 * @version 1.0
 */
public class UserMapperTest {
    private SqlSession sqlSession;

    // JUnit5 @BeforeAll和@BeforeEach注解替换了 JUnit4 中的@Before注解。
    // 它⽤于表⽰应在当前类中的每个@Test⽅法之前执⾏注解⽅法。
    // 注意：@BeforeAll注解的⽅法必须为静态⽅法，否则它将引发运⾏时错误。
    // 注意：@BeforeEach注解的⽅法不得为静态⽅法，否则它将引发运⾏时错误。
//    @BeforeEach
//    public void openSqlSession() throws IOException {
//        // 核心配置文件classpath路径
//        String resource = "mybatis-config.xml";
//        // 加载配置文件
//        Reader reader = Resources.getResourceAsReader(resource);
//        // 构建会话工厂
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        // 从SqlSessionFactory对象中获取SqlSession
//        sqlSession = sqlSessionFactory.openSession(true);
//    }

    @Test
    public void selectAll() {
        sqlSession = SqlSessionUtils.getSqlSession();
        // 获取该接口的代理对象反射机制
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行接口中的方法（通过接口的配置文件进行执行）
        List<User> people = mapper.selectAll();

        // 释放SqlSession资源
        sqlSession.close();
        // 遍历集合lambda表达式
        people.forEach(System.out::println);
    }
}



