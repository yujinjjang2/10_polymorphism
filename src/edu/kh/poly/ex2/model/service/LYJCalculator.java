package edu.kh.poly.ex2.model.service;

public class LYJCalculator /*extends Animal */implements Calculator{
	// 클래스, 인터페이스 동시 상속 가능
	// 인터페이스는 다중 상속 가능
	
	// extends : 확장하다 , implements : 구현하다
	// (부)클래스 - (자)클래스 : extends (추상클래스 포함)
	// (부)인터페이스 - (자)클래스 상속 시 implements

	@Override
	public int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	@Override
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	@Override
	public int multiple(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	@Override
	public int divide(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
	
	

}
