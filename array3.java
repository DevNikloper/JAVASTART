public class array3 {
    public static void main(String[]args){
        //for 1D array!!!!
        int r[]={100,12,122,34};
        for (int n:r){
            System.out.println(n);

        }
        //for 2D array!!!
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(" ");
        for (int j[]:a){
            for(int k:j){
                System.out.println(k);
            }
            System.out.println(" ");
        }
    }
    
}
