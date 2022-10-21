package com.jap.calculator;

import java.lang.Math;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Enter number non-Negative and greater than Zero");
		}

		return Math.ceil(num);
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Enter number non-Negative and greater than Zero");
		}
		return Math.floor(num);
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if(num1<num2)
		{
			throw new CalculatorException("Number 1 must be greater than number two");
		}

		return (long)Math.pow(num1,num2);
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
			//or else call sqrt method of Math class and return the value
		if(num<=0)
		{
			throw new CalculatorException("Enter number non-Negative and greater than Zero");
		}

		return Math.sqrt(num);
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println("scientificCalculator.cielOfANumber(10) = " + scientificCalculator.cielOfANumber(5.6F));
		} catch (CalculatorException e) {
			e.printStackTrace();
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			System.out.println("scientificCalculator.floorOfANumber(5) = " + scientificCalculator.floorOfANumber(5));
		} catch (CalculatorException e) {
			e.printStackTrace();
		}
		try{
			System.out.println("scientificCalculator.power(2,4) = " + scientificCalculator.power(2, 4));

		}catch(CalculatorException e)
		{
			e.printStackTrace();
		}
		try{
			System.out.println("scientificCalculator.squareRoot(4) = " + scientificCalculator.squareRoot(4));
		}catch (CalculatorException e)
		{
			e.printStackTrace();
		}
	}
}
