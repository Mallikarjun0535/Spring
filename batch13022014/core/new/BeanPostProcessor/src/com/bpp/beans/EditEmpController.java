package com.bpp.beans;

import java.util.Date;

public class EditEmpController {
	private EmpVO empVO;
	private EmpDao empDao;

	public void editEmp(int empId, String name, float salary) {
		empVO.setId(empId);
		empVO.setName(name);
		empVO.setSalary(salary);

		empDao.updateEmp(empVO);
	}

	public void setEmpVO(EmpVO empVO) {
		this.empVO = empVO;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

}
