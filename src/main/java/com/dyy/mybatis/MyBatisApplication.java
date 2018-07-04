package com.dyy.mybatis;

import com.dyy.mybatis.entity.MemoGroup;
import com.dyy.mybatis.mapper.MemoGroupMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.Date;

public class MyBatisApplication {

    public static SqlSessionFactory sessionFactory;
    public static void buildSqlSessionFactoryWithXml(){
        try {
            sessionFactory  = new SqlSessionFactoryBuilder().build
                    (Resources.getResourceAsStream("mybatis-config.xml"));
            System.out.println(sessionFactory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        buildSqlSessionFactoryWithXml();
        SqlSession sqlSession = sessionFactory.openSession(true);
        MemoGroup memoGroup = new MemoGroup();
        memoGroup.setName("dyy");
        memoGroup.setCreatTime(new Date());
        MemoGroupMapper memoGroupMapper = sqlSession.getMapper(MemoGroupMapper.class);
        int effect = memoGroupMapper.insertMemoGroup(memoGroup);
        System.out.println(effect);
        sqlSession.close();
    }
}
