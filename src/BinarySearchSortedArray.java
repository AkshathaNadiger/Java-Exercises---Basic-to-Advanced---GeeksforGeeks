public class BinarySearchSortedArray {

    public static int binarySearch(int[] arr, int target){
        //int left ;
       // int right;
       // int mid;
//        for(int i=0; i<arr.length;i++){
            int left=0;
            int right=arr.length-1;
            int  mid;
            while(left<right){
                mid = (left+right)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    left ++;
                }
                else{
                    right--;
                }
            }
//        }
        return -1;
    }


    static void main() {
        int[] arr = {2,4,6,8,10,12};
        int target = 6;

        int result = binarySearch(arr, target);

        System.out.println("Element found at index:" +result);

       // if(result==-1){
        //    System.out.println("Element not found");
        //}
       // else{
           // System.out.println("Element found at index:" +result);
       // }

    }
}
