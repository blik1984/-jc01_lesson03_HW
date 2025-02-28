package edu.training.jc.linnear_program_two;

/**
 * Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
 * (x2, у2).
 */

public class LinnearTwo2 {

	public static void main(String[] args) {

		double XPointA;
		double YPointA;
		double XPointB;
		double YPointB;
		double length;

		XPointA = 5.5;
		YPointA = 0;
		XPointB = 9;
		YPointB = -2;

		if (XPointA == YPointA && XPointA == XPointB && XPointA == YPointB) {

			System.out.println("Точки имеют одинаковые координаты, длина линии = 0");
			return;
		}

		length = Math.sqrt(Math.pow(YPointA - YPointB, 2) + Math.pow(XPointA - XPointB, 2));

		System.out.println(length);
	}

}
