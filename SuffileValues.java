package cloud_vandana_test_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffileValues {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>();
        for (int value : originalArray) {
            list.add(value);
        }

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array if needed
        int[] shuffledArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            shuffledArray[i] = list.get(i);
        }

        // Print the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
