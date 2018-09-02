import java.util.Scanner;
public class palindrone
{
    public static void main(String args[]){
    int i,sum=0;
    System.out.println("ENter the value: ");
    Scanner sc = new Scanner(System.in);
    i = sc.nextInt();
    sc.close();
    int temp = i;
    while(i>0){
    int y=i%10;
        sum=(sum*10)+y;
       i=i/10;
    }
    if(temp == sum){
    System.out.println("Palindrome");
}
else{
System.out.println("Not a palindrome");
}
}
}
