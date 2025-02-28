package edu.training.jc.linnear_program_two;

/**
 * Написать программу, которая выводит на экран первые четыре степени числа π.
 */

public class LinnearTwo5 {

	public static void main(String[] args) {
		
		double result;

		for (int i = 0; i < 4; i++) {
			result = Math.pow(Math.PI, i);			//не задано что считать первой степенью, возьмём с ноля.
			System.out.println("Число π в степени " + i + " равно " + result);
		}
	}
}
