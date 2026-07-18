class Count{
    public static void main(String[] args) {
        int arr[]={2,4,2,5,4,2,7};
        for(int i=0;i<arr.length;i++){
            boolean visited=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    visited=true;
                    break;
                }
            }
                if(visited){
                    continue;
                }
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            System.out.println(arr[i]+"->"+count);
            }
        }
    
    }