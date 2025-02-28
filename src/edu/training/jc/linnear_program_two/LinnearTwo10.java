package edu.training.jc.linnear_program_two;

/**
 * Известна длина окружности. Найти площадь круга, ограниченного этой
 * окружностью
 */

public class LinnearTwo10 {

	public static void main(String[] args) {

		double perimeter;
		double square;

		perimeter = 3.141592;

		square = perimeter * (perimeter / Math.PI);

		System.out.println(square);

	}

}
