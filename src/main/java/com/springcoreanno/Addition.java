package com.springcoreanno;

public class Addition {
	private int a;
	private int b;
	
	Addition(int a,int b){
		this.a=b;
		this.b=b;
		System.out.println(" value : int int ");
	}
	
	Addition(double a,double b){
		this.a=(int) b;
		this.b=(int)b;
		System.out.println(" value : double double ");
	}
	
}
