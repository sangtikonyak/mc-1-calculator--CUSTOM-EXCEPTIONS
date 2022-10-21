package com.jap.calculator;


public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	public int subtract(int num1, int num2)
	{	
		return num1-num2;
	}
	public int multiply(int num1, int num2)
	{	
		return num1*num2;
	}
	public int divide(int num1, int num2)
	{
		//write the code and handle the ArithmeticException
		int res=0;
		try{
			res=num1/num2;
		}catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
         return res;

	}
	public int modulo(int num1, int num2)
	{	
		return num1%num2;
	}

	public static void main(String[] args) {
		MathematicalCalculator m=new MathematicalCalculator();
		System.out.println("m.div(10,20) = " + m.divide(20, 0));
	}
}
