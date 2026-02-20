package DSA_PROGRAMME;

public class BinarySearch {
    //Binary Search Programme
    public static int binarySearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=left+(right+left)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrNumber={2,6,7,5};
        int targetvalue=5;
        int result=binarySearch(arrNumber,targetvalue);
        System.out.println(result);
    }
}
