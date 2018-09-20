
/**
 * Write a description of class Selection_sort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Selection_sort
{ // instance variables - replace the example below with your own
     static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=i; j < n; j++){  
                          if(arr[i] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j];  
                                 arr[j] = arr[i];  
                                 arr[i] = temp;  
                         }  
                          
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
