public class InsertionSort {
 
    public static void main(String[] args) {
         
        int[] numbers = {8,3,7,8,7,1,0};
        insertionSort(numbers);
    }
     
    private static void printNumbers(int[] numbers) {
         
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void insertionSort(int numbers[]) {
        for (int j = 1; j < numbers.length; j++) {
            int key = numbers[j];
            int i = j-1;
            while ( (i > -1) && ( numbers [i] > key ) ) {
                numbers [i+1] = numbers [i];
                i--;
            }
            numbers[i+1] = key;
            printNumbers(numbers);
        }
    }
}