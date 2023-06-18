import java.util.*;
public class prime {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,c=0,j,n=0;
        System.out.println("plz enter the elements of array");
        for (i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("finding the prime numbers");
        for (i=0;i<5;i++){
            c=0;
            for(j=1;j<=a[i];j++){
                if (a[i]%j==0){
                    c++;
                }
            }
            if (c==2){
                n++;
            }
        }
        System.out.println("no of prime numbers in array"+" "+ n);
    }
}
