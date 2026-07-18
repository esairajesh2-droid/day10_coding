import java.util.Scanner;
class MatEqual{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows;
        int cols;
        boolean equal=true;
        System.out.println("enter no of rows:");
        rows=sc.nextInt();
        System.out.println("enter no of cols:");
        cols=sc.nextInt();
        int arr1[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        System.out.println("enter the elements for 1st matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements for second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    System.out.println("Matrices are not equal");
                    return;
                }
            }
        }
        if(equal==true){
            System.out.println("Matrices are equal");
        }
    }
}