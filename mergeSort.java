
/**
 * Write a description of class mergeSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class MergeSort{
    public void merge(int arr[],int l, int m, int r){
        // Find size of two sub arrays
        int n1 =m-l+1;
        int n2=r-m;
        
        //create temp array
        int L[]=new int[n1];
        int R[] = new int[n2];
        
        //Copy data in temp array
        for(int i=0;i<n1;i++){
         L[i]=arr[l+1];
        }
        for(int j=0;j<n2;j++){
        R[j]=arr[m+1+j];
        }
        
        // Merge arrray
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[i]){
            arr[k] = L[i];
            i++;
            }
            else{
            arr[k]=R[j];
            j++;
            }
            k++;
        }
        // Copy rmaing elements of L[]
        while(i<n1){
        arr[k]=L[i];
        i++;
        k++;
        }
        
        while(j<n2){
        arr[k]=R[j];
        j++;
        k++;
        }
    
    }
    
public void sort(int arr[], int l, int r){
    if(l<r){
        int m = (l+r)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        
        merge(arr, l, m, r);
    }
}
}


public class mergeSort
{
   public static void main(String[] args){
    int arr[]={12, 11, 13, 5, 6, 7};
    MergeSort ob = new MergeSort();
    ob.sort(arr, 0, arr.length-1);
    } 
}
