

public class linear {

    public static int search(int arr[],int x){
        int n=arr.length;
        for(int i=0; i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={1,243,2,21,2,2};
        int x=2;
        int findout= search(arr, x);
        
        if(findout==-1){
            System.out.print(x+"is not present in the array");
        }
        else 
        {
            System.out.print(x+" is present in index of: "+findout);
        }
    }
    
}
