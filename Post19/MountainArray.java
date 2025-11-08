package Post19;

public class MountainArray {
    public static int main(String[] args) {
        int[] arr = {0, 1, 0};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
    
}

