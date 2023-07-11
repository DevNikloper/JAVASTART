import java.util.*;
public class sumPrime {
    public static void main(String args[]){
        int num;
        System.out.println("enter the value of number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<=num/2;i++){
            if(prime(i)==1){
                if(prime(num-i)==1){
                    System.out.println("possible"+ i+ "+"+(num-i));
                }
            }
        }
    }

     static int prime(int a){
        int c=0;
        for(int j=2;j<=a;j++){
            if(a%j==0){
                c++;

            }
        }
        return c;
    }
}
