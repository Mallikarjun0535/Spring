package com.bpp.beans;

public abstract class EditEmpController {
	private EmpDao empDao;

	public void editEmp(int id, String name, float salary, String email) {
		EmpVO vo = null;

		vo = lookupEmpVO();
		vo.setId(id);
		vo.setName(name);
		vo.setSalary(salary);
		vo.setEmail(email);

		empDao.updateEmp(vo);		
	}

	public abstract EmpVO lookupEmpVO();

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

}
