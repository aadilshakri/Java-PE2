import java.io.*;
import java.util.Scanner;
class EvenNumTest{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println (isEven(n));
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}