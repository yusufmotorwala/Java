import java.util.*;

class Hollow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        //outer loop
        for(int i=1;i<=n;i++){

            //inner loop
            for(int j=1; j<=m;j++){

                //condition
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}