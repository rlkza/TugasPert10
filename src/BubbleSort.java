import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public void sort(int[] numbers) {
        boolean swapped;
        int n = numbers.length;
        do {
            swapped = false;
            int lastSorted = n;
            for (int i = 1; i < n; ++i) {
                if (numbers[i-1] > numbers[i]) {
                    swap(numbers, i-1, i);
                    swapped = true;
                    // All above the last swap is already sorted:
                    lastSorted = i;
                }
            }
            n = lastSorted;
        } while (swapped);
    }

    private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
}