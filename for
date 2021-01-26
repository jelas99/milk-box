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