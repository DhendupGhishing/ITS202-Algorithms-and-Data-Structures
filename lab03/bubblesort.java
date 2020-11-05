public class bubblesort{

    static void bubble(int temp[]){
        int l=temp.length;
        int k=0;
        for(int i=0;i<l;i++){
            for(int j=1;j< (l-i);j++){
                if(temp[j-1]>temp[j]){
                     k=temp[j-1];
                     temp[j-1]=temp[j];
                     temp[j]=k;

                }
            }
        }
    
    }
        public static void main(String[] args) {
        int [] array={3,2,1,3,15};
        System.out.println("initail array");
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        bubble(array);
            System.out.println("\nSorted array");
            for(int i=0;i<array.length;i++){
                System.out.print(" "+array[i]);
            }
        
    }
}

