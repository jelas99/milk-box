package com.milk;

public final class MilkCalculator {

	/**
	 * Number of boxes possible with some money and possible return of empty boxes
	 * 
	 * @param money allowed
	 * @param price by box
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
	
	
	
	
//	private int calculateNumberOfFreeBoxsCycle(int possibleBoxs, int free) {
//		int newFreeBoxs = 0;
//		int newIteration = possibleBoxs;
//		
//		for (int i = 0; i < newIteration; i++) {
//			if (newIteration < free) {
//				break;
//			}
//			if (newIteration == free) {
//				newFreeBoxs++;
//				break;
//			}
//			
//			
//			newFreeBoxs = newFreeBoxs + newIteration / free;
//			newIteration = newIteration / free + (newIteration % free);
//			
//			i = 0;
//			
//		}
//		
//
//
//		return newFreeBoxs;
//	}
}
