import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[]){
    int sum=0,i;
    System.out.println("Enter the value");
    Scanner sc = new Scanner(System.in);
    i = sc.nextInt();
    sc.close();
    int temp = i;
    while(i>0){
    int r = i%10;
    int f = r*r*r;
    sum= sum + f;
    i=i/10;
}
if(temp == sum){
    System.out.println("Palindrome");
    }
    else{
    System.out.println("Not a Palindrome");
}
}}
