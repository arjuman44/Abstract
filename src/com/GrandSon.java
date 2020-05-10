package com;

public class GrandSon extends Son {
	
	@Override
	void m1()
	
	{
		System.out.println("father is the best");
		
		
	}
	@Override
    void m2()
	
	{
		System.out.println("Son is the best");
		
		
	}
	
	public static void main(String[] args) {
		
		GrandSon G = new GrandSon();
		
		G.m1();
		G.m2();
		
	}

}
