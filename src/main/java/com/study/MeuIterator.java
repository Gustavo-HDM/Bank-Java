package com.study;

import java.util.Iterator;

public class MeuIterator<E> implements Iterator<E>{

	private E[] elementos;
	private int index;
	
	public MeuIterator(E[] elementos) {
		super();
		this.elementos = elementos;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < elementos.length;
	}

	@Override
	public E next() {
		return elementos[index++];
	}

	
	
}
