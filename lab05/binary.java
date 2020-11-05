class binary{ 
   
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            
            if (arr[mid] == x) 
                return mid; 
  
             
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        return 0; 
    } 
  
   
    public static void main(String args[]) 
    { 
        binary ob = new binary(); 
        int arr[] = { 6,2,1,5,20,7,4,3,9}; 
        int n = arr.length; 
        int x = 20; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("The Element "+ x+" is found at index " + result); 
    } 
}