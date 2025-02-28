package edu.training.jc.linnear_program_two;

/**
 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
 * геометрическое модулей этих чисел.
 */

public class LinnearTwo7 {

	public static void main(String[] args) {

		double a;
		double b;
		double sum;
		double medium;

		a = 6;
		b = -15;

		sum = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		medium = Math.sqrt(Math.abs(a * b));

		System.out.println(sum);
		System.out.println(medium);

	}

}
