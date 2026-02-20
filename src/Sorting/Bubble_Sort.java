package Sorting;

public class Bubble_Sort {
    //Create Bubble Sorting Array Design
    public static int bubbleSorting(int[] arr){
        //i loops
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Create Java Array Programme of Bubble sorting
        int[] arr={2,5,6,23,4,8};
        int result=bubbleSorting(arr);
        System.out.println(result);
    }
}
