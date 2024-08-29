import java.util.Scanner;

import util.java.*;
class Even{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();

        for(int n=0; n<=i; n++){
            if(n%2==0){
          System.out.println(n);
          }
        }
    }
}