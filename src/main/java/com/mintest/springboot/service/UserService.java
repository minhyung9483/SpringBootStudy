package com.mintest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintest.springboot.dao.UserDao;
import com.mintest.springboot.vo.UserVo;

@Service
public class UserService {
	@Autowired
	public UserDao dao;
	
	public List<UserVo> selectAll() {
		return dao.selectAll();
	}

}
