package edu.training.jc.linnear_program_two;

/**
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса
 * R
 */

public class LinnearTwo4 {

	public static void main(String[] args) {

		double R;
		double perimeter;
		double square;

		R = 3.7;

		perimeter = R * Math.PI;
		square = Math.PI * Math.pow(perimeter, 2); // или square = perimeter * R;
		System.out.println("Длина окружности = " + perimeter + ", площадь круга = " + square + ".");

	}

}
