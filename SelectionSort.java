public class SelectionSort {


	public static void main(String[] args) {
		int[] numbers = {8,3,7,8,7,1,0};
		for (int i = 0; i < numbers.length - 1; i++) {
			int minIndex = i;
	 		for (int j = i + 1; j < numbers.length; j++) {
  				if (numbers[j] < numbers[minIndex]) {
   					minIndex = j;
   				}
   			}
			swap(numbers, i, minIndex);
		}
		
	}
	
	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		System.out.println(numbers[i]);

	}
	public boolean isSorted(int[] numbers) {
		for (int i=0; i<numbers.length-1; i++) {
			if (!(numbers[i]<numbers[i+1])) {
   			   return false;
			}
		}
		return true;
	}

}
