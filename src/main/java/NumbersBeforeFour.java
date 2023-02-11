import java.util.ArrayList;
import java.util.List;

public class NumbersBeforeFour {

    public int[] numbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        int[] result;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                counter++;
            }
        }
        if (counter < 1) {
            throw new RuntimeException("Value not found");
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != 4) {
                    list.add(arr[i]);
                } else if (arr[i] == 4) {
                    break;
                }
            }
            result = new int[list.size()];

            for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
                result[j] = list.get(i);
            }
        }

        return result;
    }
}

