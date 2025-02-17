package com.yedam.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yedam.app.dept.mapper.DeptMapper;

public class DeptTests {
	@Autowired //필드 주입 위험함
	private DeptMapper deptMapper;
	
//	@Test
//	void contextLoads() {
//		List<DeptVO> list = deptMapper.selectDeptList();
//		for(DeptVO dept : list) {
//			System.out.println(dept);
//		}
//		assertTrue(!list.isEmpty());
//	}
	
//	@Test
//	void infoTest() {
//		DeptVO deptVO = new DeptVO();
//		deptVO.setDepartmentId(10);
//		
//		DeptVO findVO = deptMapper.selectDeptInfo(deptVO);
//		System.out.println(findVO);
//	}
	
//	@Test
//	void insertTest() throws ParseException{
//		DeptVO deptVO = new DeptVO();
//		deptVO.setDepartmentId(999);
//		deptVO.setDepartmentName("com");
//		deptVO.setLocationId(1800);
//		deptVO.setManagerId(200);
//		
//		int result = deptMapper.insertDeptInfo(deptVO);
//		
//		assertEquals(1, result);
//	}
	
//	@Test
//	void updateTest() throws ParseException{
//		DeptVO deptVO = new DeptVO();
//		deptVO.setDepartmentId(999);
//		
//		DeptVO findVO = deptMapper.selectDeptInfo(deptVO);
//		
//		findVO.setDepartmentName("122");
//		findVO.setLocationId(1800);
//		findVO.setManagerId(100);
//		
//		int result = deptMapper.updateDeptInfo(findVO);
//		
//		assertEquals(1, result);
//	}
	
	@Test
  void delTest() {
		int result = deptMapper.deleteDeptInfo(999);
		assertEquals(1, result);
	}
}
