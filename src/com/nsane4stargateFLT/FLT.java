package com.nsane4stargateFLT;

public class FLT {
	private long p;
	
	public FLT() {}

	boolean isProbablyPrime(long p) {
		for (int index = 1; index <= 20; index++){
			long a = Math.round(Math.floor(Math.random()*(p-2)+2.0));
			if (powermod(a, p-1, p) != 1) {
				return false;
			}
		}
		return true;
	}
	
	long powermod(long i, long e, long m) {
		//System.out.println(i + " " + e + " " + m);
		if (e == 0) return 1;
		if (e % 2 == 0) return squaremod(powermod(i, e/2, m), m) % m;
		else return i * powermod(i, e-1, m) % m;
	}
	
	long squaremod(long i, long m) {
		return i*i % m;
	}
	
	void setP(long num) {
		p = num;
	}
	
	long getP() {
		return p;
	}
}
