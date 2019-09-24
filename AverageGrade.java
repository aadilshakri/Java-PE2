import java.io.*;
import java.util.Scanner;
class AverageGrade{
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of students :");
        int no_students = scanner.nextInt();
        int [] grades= new int[no_students];
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<no_students;i++){
            System.out.print("Enter grade of student" + (i+1)+ ":");
            grades[i]=scanner.nextInt();
            sum=sum + grades[i];
            if(grades[i]>max){
                max=grades[i];
            }
            if(grades[i]<min){
                min=grades[i];
            }
        }
        double average=sum/no_students;
        System.out.println("The average is"+" "+average);
        System.out.println("The maximum is"+" "+ max);
        System.out.println("The minimum is"+" "+ min);
    }
}