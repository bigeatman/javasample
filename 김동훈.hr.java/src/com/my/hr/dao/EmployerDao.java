package com.my.hr.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.my.hr.domain.Employer;
import com.my.hr.exception.EmployerIdNotFoundException;
import com.my.hr.exception.InvaildNameLengthException;
import com.my.hr.exception.OutofDaoSizeException;

public class EmployerDao {

	/** index for last Employer id */
	private int index;

	/** list for save all Employer instance */
	private final List<Employer> list;

	/**
	 * Constructor
	 */
	public EmployerDao() {
		super();
		list = new ArrayList<>();
		index = 0;
	}

	/**
	 * insert into list instance.
	 * 
	 * @param emp Target instance to add
	 * @throws OutofDaoSizeException      list size over the 100
	 * @throws InvaildNameLengthException name length over 5
	 */
	public void insert(String name, LocalDate regDate) throws OutofDaoSizeException, InvaildNameLengthException {
		if (name.length() >= 5) {
			throw new InvaildNameLengthException();
		}

		if (this.list.size() >= 100) {
			throw new OutofDaoSizeException();
		}

		Employer emp = new Employer(getNewEmployerId());
		emp.setName(name);
		emp.setRegDate(regDate);
		list.add(emp);
	}

	/**
	 * get the employer id not using.
	 * 
	 * @return id not using.
	 */
	public int getNewEmployerId() {
		return index++;
	}

	/**
	 * find single Employer instance by id.
	 * 
	 * @param id find target id
	 * @return single instance
	 * @throws EmployerIdNotFoundException if id not exists in list
	 */
	public Employer selectById(int id) throws EmployerIdNotFoundException {
		for (Employer emp : list) {
			if (emp.getId() == id) {
				return emp;
			}
		}

		throw new EmployerIdNotFoundException(id);
	}

	/**
	 * return all Employer in list.
	 * 
	 * @return All Employer list(copied)
	 */
	public Collection<Employer> selectAll() {
		return new ArrayList<Employer>(list);
	}

	/**
	 * Update single Employer instance.
	 * 
	 * @param emp Edited Employer instance
	 * @throws EmployerIdNotFoundException if id not exists in list
	 * @throws InvaildNameLengthException  if name length over 5
	 */
	public void update(Employer emp) throws EmployerIdNotFoundException, InvaildNameLengthException {
		if (emp.getName().length() >= 5) {
			throw new InvaildNameLengthException();
		}

		selectById(emp.getId()).setName(emp.getName());
	}

	/**
	 * remove single Employer instance.
	 * 
	 * @param emp remove target instance.
	 */
	public void delete(Employer emp) {
		list.remove(emp);
	}
}
