package com.mehmet.calculator;

public class CalculatorModel {

	
	private static double display = 0;					//keeps display screen variable
	private static double buffer = 0;					//keeps memory variable
	private static String operationOption = null;		//keeps current operation
	private static boolean dotFlag = true;				//Controls fraction and decimal part
	private static int afterDotCounter = 0;				//Number of digits of fraction part
	private static double lastDigit;					//last digit appended on screen
	private static double temp;							//keeps display screen value before it gets 0
	
	/*-----------------Accessor Functions-------------*/

	public static double getDisplay() {
		return display;
	}
	
	public static double getBuffer()
	{
		return buffer;
	}
	
	public static int getAfterDotCounter()
	{
		return afterDotCounter;
	}
	
	public static double getTemp()
	{
		return temp;
	}
	
	/*-------------------------------------------------*/
	
	
	/*------------------Button Function----------------*/
	
	//Fonction for numeric buttons
	public static void numericButton(double button) {
		if(dotFlag)			//writes decimal part
		{
			display = display * 10 + button;
			lastDigit = button;
		}
		else				//writes fractional part
		{
			++afterDotCounter;
			display = display + button * Math.pow(0.1, afterDotCounter);
			lastDigit = button * Math.pow(0.1, afterDotCounter);
		}
	}
	
	//Function that changes sign of operand
	public static void sign()
	{
		display *= -1;
	}
	
	//Add function
	public static boolean sum()
	{
		if(operationOption == null)
			operationOption = "+";
		if (buffer == 0.0)
			buffer = display;
		else
		{
			operation();
			operationOption = "+";
		}
		temp = display;	
		display = 0;
		dotFlag = true;
		afterDotCounter = 0;
		
		return true;
	}
	
	//Subtraction function
	public static boolean subtract()
	{
		if(operationOption == null)
			operationOption = "-";
		if (buffer == 0.0)
			buffer = display;
		else
		{
			
			operation();
			operationOption = "-";
		}
		temp = display;
		display = 0;
		dotFlag = true;
		afterDotCounter = 0;
		
		return true;
	}
	
	//Multipication function
	public static boolean multiply()
	{
		if(operationOption == null)
			operationOption = "*";
		if (buffer == 0.0)
			buffer = display;
		else
		{
			
			operation();
			operationOption = "*";
		}
		temp = display;
		display = 0;
		dotFlag = true;
		afterDotCounter = 0;
		return true;
	}
	
	//Division function
	public static boolean divide()
	{
		if(operationOption == null)
			operationOption = "/";
		if (buffer == 0.0)
			buffer = display;
		else
		{
			
			operation();
			operationOption = "/";
		}
		
		temp = display;
		display = 0;
		dotFlag = true;
		afterDotCounter = 0;
		return true;
	}
	
	//Mod function
	public static boolean modulus()
	{
		if(operationOption == null)
			operationOption = "%";
		if (buffer == 0.0)
			buffer = display;
		else
			operation();
		temp = display;
		display = 0;
		dotFlag = true;
		afterDotCounter = 0;
		operationOption = "%";
		return true;
	}
	
	//square root function
	public static void sqrt()
	{
		display = Math.sqrt(display);
	}
	
	public static void square()
	{
		display = display * display;
	}
	
	//Square function
	public static void oneOverX()
	{
		display = 1 / display;
	}
	
	//Absolute value function
	public static void abs()
	{
		display = Math.abs(display);
	}
	
	//Fraction function
	public static void dot()
	{
		dotFlag = false;
	}
	
	//Clears current screen
	public static void CE()
	{
		display = 0;
	}
	
	//Cleans everything
	public static void C()
	{
		display = 0;
		buffer = 0;
		operationOption = null;
		dotFlag = true;
		afterDotCounter = 0;
	}
	
	//Operates operations
	public static void operation()
	{
		if (operationOption.compareTo("+") == 0)
			buffer += display;
		else if (operationOption.compareTo("-") == 0)
			buffer -= display;
		else if (operationOption.compareTo("*") == 0)
			buffer *= display;
		else if (operationOption.compareTo("/") == 0)
			buffer /= display;
		else
			buffer %= display;
	}
	
	//Equal sign
	public static void equal()
	{
		operation();
	}
	
	//Backspace function
	public static void backSpace()
	{
		if(dotFlag)  //removes decimal part
		{
			display -= lastDigit;
			display /= 10;
		}
		
		else	//removes fractional part
		{
			display -=lastDigit;
			afterDotCounter--;
		}
	}
}