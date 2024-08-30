import java.util.Scanner;

import util.java.*;

class SolidRectangle{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
   
        //inner loop
        for(int i=0; i<=n; i++){
           
            //outer loop
            for(int j=1; j<=m;j++){
            System.out.print("*");
           }
           System.out.println("*");
        }
    }
}