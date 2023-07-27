package StringQNA;

public class ShortDist {
    public static int shortest(String s[],String word1, String word2){
        int d1=-1,d2=-1;// -1 incase word not present
        int ans=Integer.MAX_VALUE;
        //traversing the atring
        for(int i=0;i<s.length;i++){
            if (s[i]==word1){
                d1=i;
            }
            if(s[i]==word2){
                d2=i;
            }
            if(d1 !=-1 && d2 !=-1){
                ans=Math.min(ans, Math.abs(d2-d1));
            }

        }
        return ans;

    }
    public static void main(String[]args){
        String s[]={"the","quick","brown","fox","quick"};
        String word1="the";
        String word2="fox";
        System.out.println(shortest(s,word1,word2));
    }
}
    

