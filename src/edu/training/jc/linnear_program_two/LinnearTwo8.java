package edu.training.jc.linnear_program_two;

/**
 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
 * объем этого куба.
 */

public class LinnearTwo8 {

	public static void main(String[] args) {

		double length;
		double squareOne;
		double squareAll;
		double volume;

		length = 3; // считаем что длина не нулевая и не отрицательная

		squareOne = Math.pow(length, 2);
		squareAll = squareOne * 6;
		volume = Math.pow(length, 3);

		System.out.println("Площадь грани = " + squareOne + ", \nплощадь полной поверхности = " + squareAll
				+ ", \nобъём куба = " + volume);
	}

}
