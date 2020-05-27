package com.mintest.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.mintest.springboot.vo.UserVo;

public interface UserMapper {
	public List<UserVo> selectAll();
}
