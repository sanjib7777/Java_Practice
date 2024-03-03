import java.util.Scanner;

public class EvenOdd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int []arr= new int[10];
        int []arrEven=new int[10];
        int []arrOdd=new int [10];
        for (int i=0;i<10;i++){
            System.out.println("enter "+i+" elements");
            arr[i]=sc.nextInt();
        }
        int j=0;
        int k=0;
       for(int i=0;i<10;i++){
           if(arr[i]%2==0){
               arrEven[j]=arr[i];
               j++;
           }
           else{
               arrOdd[k]=arr[i];
               k++;
           }
       }
        System.out.println("even array is");
       for(int i=0;i<j;i++){
           System.out.println(arrEven[i]);
       }
        System.out.println("odd array is");
        for(int i=0;i<k;i++){ 
            System.out.println(arrOdd[i]);
        }
    }
}
