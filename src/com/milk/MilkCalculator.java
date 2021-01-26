package com.milk;

public final class MilkCalculator {

	/**
	 * Number of boxes possible with some money and possible return of empty boxes
	 * 
	 * @param money   allowed
	 * @param price   by box
	 * @param boxFree number of empty boxes to have free one
	 * @return
	 */
	public int numberOfBoxs(int money, int price, int boxFree) {

		if (money < price) {
			throw new RuntimeException("No Money");
		}

		int possibleBoxs = money / price;

		return possibleBoxs + calculateNumberOfFreeBoxs(possibleBoxs, boxFree);
	}

	private int calculateNumberOfFreeBoxs(int possibleBoxs, int free) {

		if (possibleBoxs < free) {
			return 0;
		}

		if (possibleBoxs == free) {
			return 1;
		}

		int newFreeBoxs = possibleBoxs / free;
		int newIteration = newFreeBoxs + (possibleBoxs % free);

		return calculateNumberOfFreeBoxs(newIteration, free) + newFreeBoxs;
	}

	public static void main(String[] args) {
		MilkCalculator calculator = new MilkCalculator();
		int value = calculator.numberOfBoxs(15, 3, 2);
		if (value != 9)
			throw new RuntimeException("Bad Algorithm");
		value = calculator.numberOfBoxs(18, 3, 2);
		if (value != 11)
			throw new RuntimeException("Bad Algorithm");
	}
}
