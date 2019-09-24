import java.io.*;
import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int k=n;
        int rev_no=0;
        while(n!=0){
            int x=n%10;
            rev_no=(rev_no*10)+x;
            n=n/10;
        }
        System.out.println(rev_no);
        
        if(k==rev_no){
           System.out.print(k+ " is a palindrome ");
        }
        else{
           System.out.print(k +" is not a palindrome ");
        }

    }
}