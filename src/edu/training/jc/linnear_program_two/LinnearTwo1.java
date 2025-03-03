package edu.training.jc.linnear_program_two;

/**
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
 * катетов.
 */

public class LinnearTwo1 {

	public static void main(String[] args) {

		double legOne;
		double legTwo;
		double hypotenuse;
		double perimeter;
		double square;

		legOne = 3;
		legTwo = 4;

		square = (legOne * legTwo) / 2;
		hypotenuse = Math.sqrt(Math.pov(legOne,2) + Math.pov(legTwo, 2);
		perimeter = legOne + legTwo + hypotenuse;

		System.out.print("Периметр прямоугольного треугольника = " + perimeter + ", площадь прямоугольного треугольника = " + square);

	}

}
