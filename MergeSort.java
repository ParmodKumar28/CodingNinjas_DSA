public class Solution {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
		if(l == r)
		{
			return;
		}
		int mid = (l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		merge(arr, mid, l, r);
    }

	public static void merge(int arr[], int mid, int low, int high) {
    int left = low;
    int right = mid + 1;
    int[] temp = new int[high - low + 1]; // Create a temporary array to store merged values
    int index = 0;

    while (left <= mid && right <= high) {
        if (arr[left] < arr[right]) {
            temp[index++] = arr[left++];
        } else {
            temp[index++] = arr[right++];
        }
    }

    while (left <= mid) {
        temp[index++] = arr[left++];
    }
    while (right <= high) {
        temp[index++] = arr[right++];
    }

    // Copy elements from temp array back to original array
    for (int i = low; i <= high; i++) {
        arr[i] = temp[i - low];
    }
}

}
