package com.yedam.app.dept.mapper;

import java.util.List;

import com.yedam.app.dept.service.DeptVO;

public interface DeptMapper {
	public List<DeptVO> selectDeptVO();
	public DeptVO selectDeptInfo(DeptVO deptVO);
	public int insertDepttInfo(DeptVO deptVO);
	public int updateDeptInfo(DeptVO deptVO);
	public int deleteDeptInfo(int deptId);
}
