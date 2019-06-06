import java.util.Scanner;
/**
 * Write a description of class Primeexample here.
 *
 * @author (Sahil)
 * @version (a version number or a date)
 */
public class Primeexample
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        int x,y;
        System.out.println("Enter the Number!");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();
        y=x/2; 
        int val=0;
        if(x==0 || x==1){
            System.out.println("Not a Prime no.");
        }
        for(int i=2;i<y;i++){
        if(x%i==0){
         val++;
         break;
        }
        }
        if(val==0){
            System.out.println("Prime no.");
        }
        else{
            System.out.println("Not a Prime no.");
        }
    }
}
