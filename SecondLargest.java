class SecondLargest{
    public static void main(String agrs[]){
        int arr[]={12,45,7,89,34,89,23};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest&&arr[i]<largest){
                secondLargest=arr[i];
            }           
        }
        System.out.println("second largest element is:"+secondLargest);
    }
}