package program2;
import java.util.*;

public class time{
         int min;
         int hrs;
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in)
        System.out.println("Enter number of minutes :");
        min=sc.nextlnt();
        hrs=min/60;
        System.out.println("Number of Hours are:" +hrs);
      } 
}
