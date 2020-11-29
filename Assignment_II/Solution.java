import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root; 
    int size=0;            // root of BST

    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
               // number of nodes in subtree

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
          
        }
    }

    /**
     * Initializes an empty symbol table.
     */

    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        
        if(size==0){
            return true;
        }
        return false;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return size;
    }

    /**
     * Does this symbol table contain the given key?
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key} and
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */


    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    

    public Value get(Key key) {
        if(key==null) throw new IllegalArgumentException("Key cannot be null");
        Node x=root;
        while(x.key!=key){
            int cmp=key.compareTo(x.key);
            if(cmp<0) x=x.left;
            else if(cmp>0) x=x.right;
        }
        if(x.key==key){
            System.out.println(x.val) ;
        }
        return x.val;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the
     * old value with the new value if the symbol table already contains the
     * specified key. Deletes the specified key (and its associated value) from this
     * symbol table if the specified value is {@code null}.
     *
     * @param key  the key
     * @param val  the value
     * @param size
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put( Key key, Value val) {
        Node x = new Node(key,val);
        if (root == null) root=x;
        else {
            Node newest=root;
            Node newnode;
            while(newest!=null){
                newnode=newest; 
                int cmp = key.compareTo(newest.key);
                if(cmp<0) {
                    newest=newest.left;
                    if(newest==null) {
                        newnode.left=x;
                        size +=1;
                        return;
                    }
                    else if(newest.key==key){
                        newest.val=val;
                        size +=1;
                        return; 
                    }
                }
                else if(cmp > 0){
                    newest=newest.right;
                    if(newest==null) {
                        newnode.right=x;
                        size +=1;
                        return;
                    }
                    else if(newest.key==key) {
                        newest.val=val;
                        size +=1;
                        return;
                    }    
                } 
            } 
        }
        size +=1;
    }
    /**
     * Returns the smallest key in the symbol table.
     *
     * @return the smallest key in the symbol table
     * @throws NoSuchElementException if the symbol table is empty
     */
    public Key min() {
        if(isEmpty()==true) throw new NoSuchElementException("NO Key! Program cannot find MIN");
        
        else {
            Node x=root;
            while(x.left!=null){
                x=x.left;
            }
            return x.key;
        }
       
    } 

    public Key max() {

        if(isEmpty()==true) throw new NoSuchElementException("NO Key! Program cannot find Max");
        else {
            Node x=root;
            while(x.right!=null){
                x=x.right;
            
            }
            return x.key;
        }

    }


    /**
     * Returns the largest key in the symbol table less than or equal to {@code key}.
     *
     * @param  key the key
     * @return the largest key in the symbol table less than or equal to {@code key}
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Key floor(Key key) {
        if(isEmpty()==true) throw new NoSuchElementException("No Element!");
       if (key==null)throw new IllegalArgumentException("Key cannot be null!");
        Node x=root;
        Node newest=null;
        while(x!=null) {
            newest=x;
            int cmp=key.compareTo(newest.key);
            if(cmp==0) return newest.key;
            if(cmp<0)x=newest.left;
            else if(cmp>0){
                x=newest.right;
                int cop=key.compareTo(x.key);
                if(cop<0) return newest.key;
                else x=newest.right;
            }
        }
        return newest.key;
        
    } 
    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
  

    public Key select(Key key){
        if(isEmpty()==true) throw new NoSuchElementException("calls floor() with empty symbol table");
        if(key == null) throw new IllegalArgumentException("calls floor() with a null key");
		Node x = root;
		Node newest = null;
		while(x != null){
			newest = x;
			int cmp = key.compareTo(newest.key);
			if(cmp > 0)x = newest.right;
			else if(cmp < 0){
				x = newest.left; 
				int cm = key.compareTo(newest.key);
				if(cm > 0 )return x.key;
				else x = newest.left;
            }
		}
		return newest.key;
	}

    /**
     * Returns all keys in the symbol table in the given range,
     * as an {@code Iterable}.
     *
     * @param  lo minimum endpoint
     * @param  hi maximum endpoint
     * @return all keys in the symbol table between {@code lo} 
     *         (inclusive) and {@code hi} (inclusive)
     * @throws IllegalArgumentException if either {@code lo} or {@code hi}
     *         is {@code null}
     */

    public Iterable<Key> keys(Key lo, Key hi) 
    {
        if (lo == null) throw new IllegalArgumentException("first argument to keys() is null");
        if (hi == null) throw new IllegalArgumentException("second argument to keys() is null");
        ArrayList<Key> arr = new ArrayList<Key>();
        keys(root, arr, lo, hi);
        return arr;
    } 
    private void keys(Node x, ArrayList<Key> arr, Key lo, Key hi) 
    { 
        if (x == null) return; 
        int cmplo = lo.compareTo(x.key); 
        int cmphi = hi.compareTo(x.key); 
        if (cmplo < 0) 
            keys(x.left, arr, lo, hi);
        if (cmplo <= 0 && cmphi >= 0) 
            arr.add(x.key);
        if (cmphi > 0) 
            keys(x.right, arr, lo, hi); 
    } 

   
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
  
    public static void main(String[] args) { 

        Solution <String, Integer> obj = new Solution <String, Integer>();
        obj.put("ABDUL",1);
        obj.get("ABDUL");
        obj.put("HRITHIK",2);
        obj.put("SAI",3);
        obj.put("SAMAL",6);
        obj.get("SAI");
        obj.put("TASHI",4);
        System.out.println("size: "+obj.size());
        // obj.get("TASHI");
        System.out.println("Min "+obj.min());
        System.out.println("floor: "+obj.floor("HRITHIK"));
        System.out.println("floor: "+obj.floor("HAHA"));
       // System.out.println(obj.select("HRITHIK"));
        System.out.println(obj.keys("ABDUL","TASHI"));
        obj.put("CHHMI",5);
        obj.put("SAMAL",4);
        System.out.println(obj.keys("ABDUL","TASHI"));
       
        System.out.println(obj.isEmpty());
        System.out.println("Max "+obj.max());
        
       
    }
}
