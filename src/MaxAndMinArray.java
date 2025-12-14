public class MaxAndMinArray {
    public static void main(String[] args){
        int arr[] = {7, 2, 5, 1, 4};

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];

            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Largest element is:" + max);
        System.out.println("Smallest element is:" + min);

    }
}
