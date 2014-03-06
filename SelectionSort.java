public class SelectionSort {
	
	public int[] numbers = {8,3,7,8,7,1,0};

	public static void main(String[] args) {
		
	}

	public int[] Selection(int[] numbers) {
		int placeHolder = numbers[0];
		int minimum = numbers[1];
		for (int j=0; j<numbers.length; j++)
			for (int i=placeHolder+1; i<numbers.length-1; i++) {
				if (numbers[i]>numbers[i+1]) {
					int minimum = numbers[i+1];
				}	
			}
			if (placeHolder>minimum) {
				
			}
		}
	}

	public void	print(int[] numbers) {
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public boolean isSorted(int[] numbers) {
		for (int i=0; i<numbers.length-1; i++) {
			if (!(numbers[i]<number[i+1]) {
   			   return false;
			}
		}
		return true;
	}

}