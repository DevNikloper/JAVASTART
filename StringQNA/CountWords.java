package StringQNA;

public class CountWords {
    public static void main(String[]args){
        String str1="I AM RAHUL AND ROHAM";
        String s[]=str1.split(" ");
        int count=0;
        for(int i=0;i<s.length;i++){
            count++;
            System.out.println(s[i]);

        }
        System.out.println("no of words in string"+" "+ count);
        
    }
    
}
