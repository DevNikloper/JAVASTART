package StringQNA;

public class DupStr {
    public static void main(String[]args){
        String str1="Great responsibility";
        int count;
        char ch[]=str1.toCharArray();
        System.out.println("duplicate charcaters in string");
        for(int  i=0;i<str1.length();i++){
            count=1;
            for(int j=i+1;j<str1.length();j++){
                if(ch[i]==ch[j] && ch[i] !=' '){
                    count++;
                    ch[j]='0';//IMPORTANT avoiding printing the same visited character
                }

            }

        
        if(count>1 && ch[i] !='0'){//IMPORTANT ch[i] checking to avoid showing 0 
            System.out.println(ch[i]);
        }
    }

    }
}

    
    

