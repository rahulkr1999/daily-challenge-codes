package array;
import java.util.Scanner;
public class Q1ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the values of the Array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Reverse(arr,size);
        System.out.print("Array After Reversed: " );
        print(arr,size);
    }
    static void Reverse(int arr[],int size){
        int start=0;
        int end=size-1;
        for(int i=0;i<size/2;i++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void print(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
