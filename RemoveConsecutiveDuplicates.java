import java.util.ArrayList;

/**
 * RemoveConsecutiveDuplicates
 */
public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        int arr[] = {10,10,20,20,20,30,40,10};
        ArrayList<Integer> result = removeConsecutiveDuplicates(arr);
        for(int i : result)
        {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> removeConsecutiveDuplicates(int arr[])
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr)
        {
            result.add(i);
        }
        for(int i=0;i<result.size()-1;i++)
        {
            if(result.get(i)==result.get(i+1))
            {
                result.remove(i+1);
            }
        }
        return result;
    }
}