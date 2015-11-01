package com.mehmet.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {

	Button add, sub, divide, multiply, CE, C, modulus, equal, sign, point,
			backSpace, sqrt, square, oneOverX, abs; // Operation buttons
	Button one, two, three, four, five, six, seven, eight, nine, zero; // Numerical
																		// buttons
	TextView display, equationDisplay;		//Screens

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_calculator);

		/*-------------------Calculator User interface references---------------*/
		//Funtions' references
		display = (TextView) findViewById(R.id.tvDisplay);
		equationDisplay = (TextView) findViewById(R.id.tvEquationDisplay);
		backSpace = (Button) findViewById(R.id.bBackSpace);
		sqrt = (Button) findViewById(R.id.bSqrt);
		square = (Button) findViewById(R.id.bSquare);
		oneOverX = (Button) findViewById(R.id.bOneOverX);
		abs = (Button) findViewById(R.id.bAbs);
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		divide = (Button) findViewById(R.id.bDivide);
		multiply = (Button) findViewById(R.id.bMultiply);
		CE = (Button) findViewById(R.id.bCE);
		C = (Button) findViewById(R.id.bC);
		modulus = (Button) findViewById(R.id.bMod);
		equal = (Button) findViewById(R.id.bEqual);
		sign = (Button) findViewById(R.id.bSign);
		point = (Button) findViewById(R.id.bPoint);
		//Numeric buttons' references
		one = (Button) findViewById(R.id.bOne);
		two = (Button) findViewById(R.id.bTwo);
		three = (Button) findViewById(R.id.bThree);
		four = (Button) findViewById(R.id.bFour);
		five = (Button) findViewById(R.id.bFive);
		six = (Button) findViewById(R.id.bSix);
		seven = (Button) findViewById(R.id.bSeven);
		eight = (Button) findViewById(R.id.bEight);
		nine = (Button) findViewById(R.id.bNine);
		zero = (Button) findViewById(R.id.bZero);

		/*------------------------Numerical Button Functions----------------------*/
		
		//Writes one
		one.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(1);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Writes two
		two.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(2);
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Writes three
		three.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(3);
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Writes four
		four.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(4);
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Writes five
		five.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(5);
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Writes six
		six.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(6);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Writes seven
		seven.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(7);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Writes eight
		eight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(8);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Writes nine
		nine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(9);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Writes zero
		zero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.numericButton(0);
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Add function
		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.sum();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(CalculatorModel.getTemp() + " + ");
				
			}
		});
		//Substraction Function
		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.subtract();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(CalculatorModel.getTemp() + " - ");
			}
		});
		//Division Function
		divide.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.divide();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(CalculatorModel.getTemp() + " / ");
			}
		});
		//Multipication function
		multiply.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.multiply();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(CalculatorModel.getTemp() + " * ");
			}
		});
		//Clears current screen
		CE.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.CE();
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Clears everything
		C.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.C();
				display.setText("" + CalculatorModel.getDisplay());
				equationDisplay.setText("");
			}
		});
		//Mod Function
		modulus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.modulus();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(CalculatorModel.getTemp() + " % ");
			}
		});
		//Changes sign
		sign.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.sign();
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Writes fractional part
		point.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.dot();

			}
		});
		//Backspace function
		backSpace.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.backSpace();
				display.setText("" + CalculatorModel.getDisplay());
			}
		});
		//Square root function
		sqrt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.sqrt();
				display.setText("" + CalculatorModel.getDisplay());
				equationDisplay.append("sqrt(" + CalculatorModel.getDisplay() + ")");

			}
		});
		//Square function
		square.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.square();
				equationDisplay.append("sqr(" + CalculatorModel.getDisplay() + ")");

			}
		});
		//One over x
		oneOverX.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.oneOverX();
				display.setText("" + CalculatorModel.getDisplay());

			}
		});
		//Absolute value function
		abs.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.abs();
				display.setText("" + CalculatorModel.getDisplay());
				equationDisplay.append("abs(" + CalculatorModel.getDisplay() + ")");

			}
		});
		//Finalize equation
		equal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				CalculatorModel.equal();
				display.setText("" + CalculatorModel.getBuffer());
				equationDisplay.append(""+CalculatorModel.getDisplay());
			}
		});
	}
}