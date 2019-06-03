
/**
 * Write a description of class bubblesort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bubblesort
{
     static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n-1; i++){  
                 for(int j=0; j < (n-i-1); j++){  
                          if(arr[j] > arr[j+1]){  
                                 //swap elements  
                                 temp = arr[j+1];  
                                 arr[j+1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          // compare element one by one 
                          //and then swap them if big 
                 }  
         }  }
    
   public static void main(String args[]){
    int arr[]={14,11,23,43,14,05,9,78};
    bubbleSort(arr);
    System.out.println("After Sort");
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
    
    }  // instance variables - replace the example below with your own
   }
