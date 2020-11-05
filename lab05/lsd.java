public class lsd{
   public static void sort(String[] a, int w){
      int N = a.length;
      int R=256;
      String [] aux= new String[N];
      for(int g=w-1;g>=0;g--){
         int [] count =new int[R+1];
         for(int i=0;i<N;i++){
            count[a[i].charAt(g)+1]++;
            
         }
         for(int j=0;j<R;j++){
            count[j+1] += count[j];
         }
         for(int i=0;i<N;i++){
            aux[count[a[i].charAt(g)]++]=a[i];
         }
         for(int i=0;i<N;i++){
            a[i]=aux[i];
         }
         for(int f=0;f<w;f++){
            System.out.println(" "+a[f]);
         }
        
      }
   }
   public static void main(String [] ar){
      String [] a={"manago","apple", "lemoan"};
      int w=3;
      sort(a,w);
   }
   }



