
/**
 * Write a description of class InsertionSort here.
 *
 * @author (Sahil)
 * @version (a version number or a date)
 */
public class InsertionSort
{
    static void instSort(int arr[],int n){
    for(int i=1;i<n;i++){
        int key = arr[i];
        int j=i-1;
        while(j>=0 && arr[j]> key){
        arr[j+1]=arr[j];
        j--; // change if i+1 is greater than i 
             // if not than countinue   
        }
        arr[j+1]=key;
    }
}
static void print(int arr[], int n){
    for(int i=0;i<n;i++){
    System.out.println(arr[i]);
    }
}
public static void main(String []args)
    {
        int arr[] = {25,28,29,37,88,45,69,73,02,4};
        int len = arr.length;
        instSort(arr,len);
        print(arr,len);
    }    
}
