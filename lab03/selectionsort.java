public class selectionsort{
   public static void main(String[] args) {
       int [] array={4,5,3,6,3,2};
       System.out.println("initial arrray");
       for(int i=0;i<array.length;i++){
           
            System.out.print(" "+array[i]);
       }
       selection(array);
       System.out.println("\nsorted Array");
       for(int i=0;i<array.length;i++){
         
           System.out.print(" "+array[i]);
       }
    }
    public static void selection(int temp[]){
        for(int i=0;i<temp.length;i++){
            int lestno=i;
            for(int j=i+1;j<temp.length;j++){
                if (temp[lestno]>temp[j]){
                    lestno=j;

                }
                int x=temp[lestno];
                temp[lestno]=temp[i];
                temp[i]=x;

            }
           
        }

    }
}