package StringQNA;

public class RomanToInt {
    public int Num(char c){
        if (c=='I')
         return 1;
        if (c=='V')
         return 5;
        if(c=='X')
         return 10;
        if(c=='L')
         return 50;
        if(c=='C')
         return 100;
        if(c=='D')
         return 500;
        if(c=='M')
         return 100;
        return -1;
    }

    int romanInt(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            int s1= Num(str.charAt(i));
            if(i+1<str.length()){
                int s2=Num(str.charAt(i+1));
                if(s1>=s2){
                    sum=sum+s1;
                }
                else{
                    sum=sum-s1;
                }
            }
            else{
                sum=sum+s1;
            }
        }
         return sum;
    }

    public static void main(String []args){
        RomanToInt b=new RomanToInt();
        String give="LXVII";
        System.out.println("INTEGR VALUE "+ b.romanInt(give));
    }
}

    

