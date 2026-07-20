public class BinarySearchEx {
public static void main(String[] args) {
    int[] arr = {2,5,7,10,12,15,17,25};
    int target = 25;
    int left = 0, right = arr.length -1;
    boolean flag = false;
    while(left<right){
        int mid = left + (right - left)/2;
        if(arr[mid] == target){
            System.out.println("Target Found");
            flag = true;
            break;
        }
        else if(arr[mid]<target){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
        if(flag == false){
            System.out.println("Target not found");
        }
    }
}
}