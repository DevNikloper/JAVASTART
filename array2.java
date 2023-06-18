//FINDING THE FACTORIAL OF THE ELEMENTS OF ARRAY
import java.util.*;
public class array2 {
    public static void main(String []args){
        int num[]=new int[5];
        int i,j;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the values of array");
        for (i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        for (i=0;i<5;i++){
            fact=1;
            for (j=1;j<=num[i];j++){
                fact=fact*j;
            }
             System.out.println("FACTORIAL"+fact);
            }

        }
    }
