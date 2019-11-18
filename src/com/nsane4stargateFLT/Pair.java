package com.nsane4stargateFLT;

public class Pair {
	private long prime;
	private int loop_count;
	
	public Pair(long p, int count) {
		this.prime = p;
		this.loop_count = count;
	}
	
	long getPrime() {return prime;}
	int getCount() {return loop_count;}
}
