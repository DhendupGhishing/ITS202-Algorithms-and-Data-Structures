//Implement Key-indexed counting algorithm.
public class index{
 public static void main(String[] args) {
   
     int []array={0,1,3,2,2,9,0};
     int number_element=array.length;
     int unique=23;
     
     int[]aux=new int[unique];
     int []count = new int[unique+1];

     for(int i=0;i<number_element;i++){
         count[array[i]+1]++;
     }
     for(int j=0;j<unique;j++){
         count[j+1] += count[j];

     }
     for(int i=0;i<number_element;i++){
         aux[count [array[i]]++]=array[i];
     }
     for(int i=0;i<number_element;i++){
         array[i]=aux[i];
     }
     for(int i=0; i<number_element;i++){
         System.out.print(" "+array[i]);
     }
        
    }
}


