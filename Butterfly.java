import java.util.*;

class Butterfly{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
         
        //1st Half

        //1st Part
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
        //Spaces
        int Spaces= 2*(n-i);
        for(int j=1;j<=Spaces;j++){
            System.out.print(" ");
        }
              
         //2nd Part
         for(int j=1;j<=i; j++){ 
            System.out.print("*");
    }
    System.out.println();
        }

        //2nd Half

        //1st Part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
         //Spaces
         int Spaces= 2*(n-i);
         for(int j=1;j<=Spaces;j++){
             System.out.print(" ");
         }
               
          //2nd Part
          for(int j=1;j<=i; j++){ 
             System.out.print("*");
     }
     System.out.println();
         }

    }
}