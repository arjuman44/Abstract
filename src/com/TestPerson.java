package com;

public class TestPerson extends Person {
	
	@Override
		void work()
		{
			System.out.println("person is working");
		}
		
		public static void main(String[] args)
		{
			
		TestPerson P = new TestPerson();
		
		P.work();
		P.sleep();
	}

}
