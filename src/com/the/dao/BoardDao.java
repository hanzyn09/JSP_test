package com.the.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.the.config.MyBatisConfig;
import com.the.domain.dto.BoardDto;

public class BoardDao {
	SqlSessionFactory sqlSessionFactory;

	public BoardDao() {
		sqlSessionFactory = MyBatisConfig.getInstance();
	}

	public List<BoardDto> getList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BoardDto> result = sqlSession.selectList("boardMapper.list");
		sqlSession.close();
		return result;
	}

}
