public class arrayDemo{
    static int[] arr;
    public static int[] resize(int length){
        int[] temp=new int [length];
        for(int i=0;i<arr.length; i++){
            temp[i]=arr[i];

        }
        temp[length - 1]=4;
        arr=temp;
        return arr;
        
    }
    public static void main(String[] args){
        arr = new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        int [] newArr=resize(4);
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]);
        }
    }
}