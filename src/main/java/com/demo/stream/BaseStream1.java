package com.demo.stream;

import java.util.Iterator;

public interface BaseStream1<T,S extends BaseStream1<T, S>>  extends AutoCloseable{
	
	void close();
	
	boolean isParallel();
	
	Iterator<T> iterator();
	
	S onClose(Runnable handler);
	
	S parallel();
	
	S sequential();
	
	S unordered();

}
