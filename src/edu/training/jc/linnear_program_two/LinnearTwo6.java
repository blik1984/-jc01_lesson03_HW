package edu.training.jc.linnear_program_two;

/**
 * Найти произведение цифр заданного четырехзначного числа.
 */

public class LinnearTwo6 {

	public static void main(String[] args) {

		int ceil;
		int result = 1;
		ceil = 6521;
		int copyCeil = ceil;

		ceil = Math.abs(ceil); // для чисел с чётным количеством цифр такое действие не нужно

		for (int i = 0; i < 4; i++) {
			int ceil2 = ceil % 10;
			if (ceil2 == 0) {
				System.out.println("Произведение цифр в числе " + copyCeil + " составляет 0");
				return;
			}
			result = result * ceil2;
			ceil = ceil / 10;
		}
		System.out.println("Произведение цифр в числе " + copyCeil + " составляет " + result);
	}
}
