import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] a=new int[t];
        for (int i=0;i<t;i++)
            a[i]=sc.nextInt();
        for (int p=0;p<t;p++){
            for (int i=1;i<=a[p];i++){
                for (int j=1;j<=a[p]-i;j++){
                    System.out.print("  ");
                }
                for (int j=1;j<i;j++){
                    System.out.print(j+" ");
                }
                for (int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}