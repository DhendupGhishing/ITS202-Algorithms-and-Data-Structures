/*#**********************************************************************************************************#
#Level 1: 15 Marks
#Question2:
#	Complete the incomplete functions in the ArrayList(Dynamic array API) class. There are 5 incomplete 
#	functions inside the class which are:
#	1) add() - which takes a generic variable as a parameter and adds the element to the dynamic array. 
#			   Insert elements into a dynamic array which doubles in size when the array is 3/4th full 
#			   and halves in size when the array is 1/4th full
#	2) pop() - this function does not take a parameter.When called pop deletes the last element in the dynamic array.
#	3) resize() - this function takes one integer parameter. When called resize changes the size of the array
#				to the value of the parameter sent.
#	4) size() - Does not take ay parameter and returns the number of elements present in the dynamic array.
#	5) toString() - Does not take any parameter and returns the string representation of the dynamic array.
#**********************************************************************************************************#*/
@SuppressWarnings("unchecked")

public class arraylist
{

   
    int frist_element, delete_element;
    int size;
    int array[];
    int length;
    int count, a;
    



	public arraylist()
	{   count=0;
        frist_element=0;
        size=8;
        array=new int[size]; 
        
	}
	public void add(int element)
	{
        if (size==0){
            array[0]=element;
            frist_element=0;
        }
        else{
            array[frist_element]=element;
            frist_element++;
        }
      
		
	}
	public void pop()
	{
        if(size==0){
            System.out.println("Array is empty currently, You dont have any element to delete");
        }
        else{
            frist_element -=1 ;
            delete_element=array[frist_element];
            array[frist_element]=0;
            
            int i=0;
            while(i<array[i]){
                count++;
                i++;

            }
            
            a=count;
            //a is new element in array
            length=(a/size);
            System.out.println("The deleted element of the array is: \t"+delete_element);
            
        }
		
	}
	public void resize()
	{
       
       if(length == 0.25*length ) {
			int newArray[] = new int[(size/2)*2];
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			size = size/2;
			
		}
		else if(length == length*0.75) {
			int newArray[] = new int[size*2];
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			size = size * 2;
			array = newArray;
			
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	public int size()
	{
		
		return size;
	}
	public String toString()
	{
        String s=Integer.toString(size);
        return s;

	}


/*#*************************************************************************************************************#
#*		DO NOT WRITE/MODIFY CODE BELOW THIS LINE. ANY CHANGES MAY CAUSE YOUR HIDDEN TEST CASES TO FAIL 		*#
#*				YOU MAY USE THE SPACE PROVIDED ABOVE TO WRITE YOUR PROGRAM. ALL THE BEST!					*#
#*************************************************************************************************************#*/



	public static void main(String[] args) {
        arraylist obj=new arraylist();
            obj.add(2);
            
              
            obj.add(12);
           
            obj.pop();
            obj.resize();
            System.out.println(obj.size());
            System.out.println(" "+obj.toString());
           
		System.out.println("representation of the dynamic array " +obj.toString());
        System.out.println("All the best! All test");
		
	

        
		
		
	}
}