package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExercises {
    public static void main(String[] args) {
        int[] arr = {1, 22, 333, 44444, 55555};
        System.out.println(Arrays.toString(arr));

        List<Integer> intList = new ArrayList<>();
        intList.add(21);
        intList.add(34);
        intList.add(78);
        System.out.println(intList);
        System.out.println(intList.get(0));
        intList.remove(Integer.valueOf(34));
        System.out.println(intList);
    }
}
