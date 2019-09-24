import java.io.*;
import java.util.Scanner;
class PowerofFour{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        while(n>=4){
            if(n%4!=0){
                System.out.println("Not a power of Four");
                break;
            }
        n=n/4;    
        }
        if(n==1){
            System.out.println("Power of Four");
        }
        
    }

}