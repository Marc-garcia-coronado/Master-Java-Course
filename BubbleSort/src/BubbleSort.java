
public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,2,4,10,9,7,6,8};

        // Bubble Sort Algorithm
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = i; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // ForEach loop
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}