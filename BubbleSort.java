public class BubbleSort {
  public static void main(String[] args) {
        int[] numbers = {8,3,7,8,7,1,0};
        swap(numbers); 
        print(numbers);
    }

    private static void swap(int[] numbers) {
        int length = numbers.length;
        int oneLess = length - 1;
        for(int j=0; j<length-1; j++) { 
            for(int k=0; k<oneLess-j; k++) { 
                if(numbers[k] > numbers[k+1]) { 
                    int temp = numbers[k]; 
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = temp;
                }
            }
        }
    }

    private static void print(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}

