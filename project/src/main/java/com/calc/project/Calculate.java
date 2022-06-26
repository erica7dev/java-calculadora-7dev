package com.calc.project;

public class Calculate {

  public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public int exponent(int basis, int expo) {
		return (int) Math.pow(basis, expo);
	}

	public double sqrt(double a) {
		return Math.sqrt(a);
	}
}
