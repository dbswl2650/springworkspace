package com.yedam.app.aop.Mapper;

import org.apache.ibatis.annotations.Insert;

public interface AaaMapper {
	@Insert("INSERT INTO tbl_aaa VALUES(#{value})")
	public int insert(String value);
}
