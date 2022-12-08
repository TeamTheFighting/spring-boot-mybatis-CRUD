package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	public List<EmpVO> selectEmp();
	
	public EmpVO selectEmpfindByEmpno(int empno);
}
