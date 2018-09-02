
/**
 * Write a description of class fibonacciexample here.
 *
 * @author (Sahil chhikara)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class fibonacciexample
{   
public static void main (String args[])
    {
        int y,x1=0,x2=1,x3,x=1;
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        sc.close();
        System.out.println(x1);
        while(x<y){
            x3= x2+x1;
            x1=x2;
            x2=x3;
            System.out.println(x3);
            x++;
        }
    }
}
