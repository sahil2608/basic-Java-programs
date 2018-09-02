
public class Armstrong
{
    public static void main(String args[]){
    int sum=0,i=154;
    int temp = i;
    while(i>0){
    int r = i%10;
    int f = r*r*r;
    sum= sum + f;
    i=i/10;
}
    System.out.println(sum);
    }
}
