package com.soap.project;

import com.soap.project.ArithmeticImpl;

public class ArithmeticImpl implements Arithmetic {
	
	
    @Override
	public float calculateSimpleInterest(int principle, int no, float rate) {
		return principle*no*rate/100;
	}

}