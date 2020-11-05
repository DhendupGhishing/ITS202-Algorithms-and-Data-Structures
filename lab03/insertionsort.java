public class insertionsort{

    public static  void insertion(int newTemp[]){  
        for(int i=1;i<newTemp.length;i++){
            int k=newTemp[i];
            int n=i-1;
            
            while((n > -1) && (newTemp[n]  > k)){
                newTemp[n+1]=newTemp[n];
                n--;   
            }
            newTemp[n+1]=k;


        }
              
          }
  public static void main(String [] args){
      int [] array ={4,56,6,7,100};
      System.out.println("Initial Array");
      for(int n=0;n<array.length; n++){
          
          System.out.print(" " +array[n]);

      
  }
  insertion(array);
  System.out.println("\nSorted Array");
  for(int i=0;i<array.length;i++){
      System.out.print(" "+array[i]);
  }
 
}
}



















































