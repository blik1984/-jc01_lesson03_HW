package edu.training.jc.linnear_program_two;

/**
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти
 * его периметр и площадь.
 */

public class LinnearTwo3 {

	public static void main(String[] args) {

		double XPointA;
		double YPointA;
		double XPointB;
		double YPointB;
		double XPointC;
		double YPointC;
		double lengthAB;
		double lengthBC;
		double lengthCA;
		double perimeter;
		double halfPerimeter;
		double square;

		XPointA = 5.5;
		YPointA = 0;
		XPointB = 9;
		YPointB = -2;
		XPointC = 1.5;
		YPointC = 10;

		if (XPointA == YPointA && XPointA == XPointB && XPointA == YPointB) {

			lengthAB = 0;

		} else {
			lengthAB = Math.sqrt(Math.pow(YPointA - YPointB, 2) + Math.pow(XPointA - XPointB, 2));

		}
		if (XPointB == YPointB && XPointB == XPointC && XPointB == YPointC) {

			lengthBC = 0;

		} else {
			lengthBC = Math.sqrt(Math.pow(YPointB - YPointC, 2) + Math.pow(XPointB - XPointC, 2));

		}
		if (XPointC == YPointC && XPointC == XPointA && XPointC == YPointA) {

			lengthCA = 0;

		} else {
			lengthCA = Math.sqrt(Math.pow(YPointC - YPointA, 2) + Math.pow(XPointC - XPointA, 2));

		}
		perimeter = lengthAB + lengthBC + lengthCA;
		halfPerimeter = perimeter / 2;
		square = Math.sqrt(halfPerimeter * (halfPerimeter - lengthAB) * (halfPerimeter - lengthBC) * (halfPerimeter - lengthCA));

		System.out.println("Периметр треугольника = " + perimeter + ", площадь треугольника = " + square);

	}

}
