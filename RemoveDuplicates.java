import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> Output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            } else {
                map.put(arr[i], true);
                Output.add(arr[i]);
            }
        }
        return Output;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 2, 3, 1, 6, 2, 5 };
        ArrayList<Integer> Output = removeDuplicates(arr);
        System.out.println(Output);
    }
}
