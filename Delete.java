import java.util.Scanner;

public class Delete {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter "+(i+1)+" elememts:");
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i <10; i++) {
            System.out.println(" elememts:"+arr[i]);
        }
        System.out.println("enter position to delete");
        int pos=sc.nextInt();
        for(int i=pos;i<10;i++ ){
            arr[i-1]=arr[i];
        }
        for (int i = 0; i <9;i++) {
            System.out.println(" elememts:"+arr[i]);
        }
    }
}
