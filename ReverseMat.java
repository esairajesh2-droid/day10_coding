import java.util.Scanner;
class ReverseMat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows;
        int cols;
        System.out.println("enter no of rows:");
        rows=sc.nextInt();
        System.out.println("enter no of cols:");
        cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}