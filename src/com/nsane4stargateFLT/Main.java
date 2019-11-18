package com.nsane4stargateFLT;

import java.util.*; 

public class Main {

	public static void main(String[] args) { 
	
		List<Pair>prime_nums = new ArrayList<Pair>();
		
		int min = (int) Math.pow(2, 30);
		int max = (int) Math.pow(2, 31);
		
		Random rand = new Random();
	
		FLT test = new FLT();
		
		int count = 0;
		int loop_count = 0;
		boolean not_a_prime;
		
		while(count < 16) {
			not_a_prime = true;
			while(not_a_prime) {
				loop_count++;
				long num = rand.nextInt((max - min) + 1) + min;
				if(test.isProbablyPrime(num)){
					Pair tuple = new Pair(num,loop_count);
					prime_nums.add(tuple);
					not_a_prime = false;
					count++;
					loop_count = 0;
				}
			}
		}
		
		for(Pair tuple: prime_nums) {
			System.out.println(String.valueOf(tuple.getPrime()) +" is a prime that was found in loop " + tuple.getCount());
		}
	}
}
