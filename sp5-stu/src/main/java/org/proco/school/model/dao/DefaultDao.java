package org.proco.school.model.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public abstract class DefaultDao<T> {

	@Autowired
	private JdbcTemplate jdbc;

	public abstract Collection<T> selectAll();

	public abstract T selectById(int id);

	public abstract boolean insert(T obj);

	public abstract boolean update(T obj);

	public abstract boolean delete(T obj);

	protected abstract RowMapper<T> getMapper();
}
