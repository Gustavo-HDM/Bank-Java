package com.repository;

public interface GenericDAO<T, E, L> {

	public void create(T object);
	public L readAll();
	public void delete(E key);
	public void update(T object, E key);
}
