package com.mintest.springboot.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mintest.springboot.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	SqlSession sqlSession;
	
	public List<UserVo> selectAll(){
		return sqlSession.selectList("selectAll");
	}
}
