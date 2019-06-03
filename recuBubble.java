
/**
 * Write a description of class recuBubble here.
 *
 * @author (Sahil chhikara)
 * @version (a version number or a date)
 */
public class recuBubble
{
    public static void revbub(int arr[], int n){
    if(n==1){
    return;
    }
    for(int i=0;i<n-1;i++){
    if(arr[i] > arr[i+1]){
    int temp = arr[i+1];  
    arr[i+1] = arr[i];  
    arr[i] = temp;   
    }
        }
        // made recurisve calling
        revbub(arr, n-1);

    for(int i=0;i<n;i++){
    System.out.println(arr[i]);
    }
    }
    public static void main(String []args)
    {
        int arr[] = {25,28,29,37,88,45,69,73,02,4};
        int len = arr.length;
        revbub(arr,len);
    }
}
