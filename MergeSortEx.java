public class MergeSortEx {
    public static void mergeSort(int[] arr, int left, int right) {
        if(left>=right) return; // base condition

        int mid =  left+(right-left)/2; // binary search middle formula
        mergeSort(arr, left, mid);  //keep dividing left half
        mergeSort(arr, mid +1, right);  //keep dividing right half
        merge(arr, left, mid, right);   //merge two sorted arrays
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int l1 = mid - left + 1;
        int l2 = right - mid;
        int[] leftArray = new int[l1]; //copy left half array
        int[] rightArray = new int[l2]; //copy right half array
    }
    public static void main(String[] args) {
        int[] arr = {8,1,5,3,7,2,6};
    }
    
}
