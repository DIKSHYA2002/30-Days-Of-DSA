package Day1;

public class ReverseArrayReecursion {
    

    public static  int[] reverseArray( int arr[] , int low , int high )
    {

       if(low >= high )
       {
            return arr;
       }
       else
       {  
          int temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;
          return reverseArray(arr, low+1, high-1);
       }
     

    } 
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        array = reverseArray(array , 0 , array.length-1);
 
        for (int i : array) {
            System.out.println(i);
        }
    }
}
