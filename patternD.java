public class patternD {
    public static void main(String []args){
        int i,j,n=7,m=7;
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
            if ( i==0 && j<(m-1)/2 || i==n-1 && j<(m-1)/2 || j==(n-1)/2 && (i>0 && i<n-1) ||  j==0){
                System.out.print("*");
            }
             else{
                System.out.print(" ");
             }}
            System.out.println( " ");

        }
}
}
