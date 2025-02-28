package edu.training.jc.linnear_program_two;

/**
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
 * его высоту, радиусы вписанной и описанной окружностей.
 */

public class LinnearTwo9 {

	public static void main(String[] args) {

		double length;
		double square;
		double height;
		double radiusIn;
		double radiusOut;

		length = 3.6;

		height = (length * Math.sqrt(3)) / 2;
		square = height * length / 2;
		radiusIn = (length * Math.sqrt(3)) / 6;
		radiusOut = (length * Math.sqrt(3)) / 3;

		System.out.println("У равностороннего треугольника со стороной " + length + " будут:"
				+ " \nплощадь треугольника = " + square + ",\nвысота треугольника = " + height + ", "
				+ "\nрадиус вписанной окружности = " + radiusIn + ", \nрадиус описанной окружности = " + radiusOut);
	}

}
