import java.util.ArrayList;

public class graph {

    private final int V;       // number of vertices
    private int E;             // number of edges 
    ArrayList<ArrayList<Integer>> graph;

    /**
     * Initializes an empty graph with {@code V} vertices and 0 edges.
     * param V the number of vertices
     * @param  V number of vertices
     * @throws IllegalArgumentException if {@code V < 0}
     */
    public graph(int node) {
        V=node;
        if(V<0) throw new IllegalArgumentException("V cannot be -ive");
        graph= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;++i){
            graph.add(new ArrayList<Integer>(E));
        }
    }
    /**  
     * Initializes a graph from the specified input stream.
     * The format is the number of vertices <em>V</em>,
     * followed by the number of edges <em>E</em>,
     * followed by <em>E</em> pairs of vertices, with each entry separated by whitespace.
     * @param  in the input stream
     * @throws IllegalArgumentException if {@code in} is {@code null}
     * @throws IllegalArgumentException if the endpoints of any edge are not in prescribed range
     * @throws IllegalArgumentException if the number of vertices or edges is negative
     * @throws IllegalArgumentException if the input stream is in the wrong format
     */
    /**
     * Returns the number of vertices in this graph.
     * @return the number of vertices in this graph
     */
    public int V() {
        return V;
        
    }
    /**
     * Returns the number of edges in this graph.
     *
     * @return the number of edges in this graph
     */
    public int E() {
        return E;
        
    }
    // throw an IllegalArgumentException unless {@code 0 <= v < V}
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
        throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
    /**
     * Adds the undirected edge v-w to this graph.
     * @param  v one vertex in the edge
     * @param  w the other vertex in the edge
     * @throws IllegalArgumentException unless both {@code 0 <= v < V} and {@code 0 <= w < V}
     */
    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        E++;  
        graph.get(v).add(w);
        graph.get(w).add(v);
        
    }
    /**
     * Returns the vertices adjacent to vertex {@code v}.
     * @param  v the vertex
     * @return the vertices adjacent to vertex {@code v}, as an iterable
     * @throws IllegalArgumentException unless {@code 0 <= v < V}
     */
    public Iterable<Integer> Arraylist(int v) {
        validateVertex(v);
        return Arraylist(v);
      
    }

    /**
     * Returns a string representation of this graph.
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *         followed by the <em>V</em> adjacency lists
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " Vertices, " + E + " Edges " + "\n");
        for (int v = 0; v < V; v++) {
            s.append("\t      "+v );
            for (int w : graph.get(v)) {
                s.append("---->"+w );
            }
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Unit tests the {@code graph} data type.
     * @param args the command-line arguments
     */
    // public void let_print(){
    //     for(int i=0;i<V;i++){
    //         System.out.print(" "+i);
    //         for(int v: graph.get(i))System.out.print("---->"+v);
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        graph g = new graph(6);
        // System.out.print(" Vertices: "+g.V()+"\t Edges: "+g.E()+"\n");
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(5,3);
        g.addEdge(3,3);
        g.addEdge(5,3);
        g.addEdge(4,2);
        g.addEdge(5,0);
    
        System.out.println("\n$$_____*******{ Path Of Graph }******______$$\n");
       System.out.println("\t      "+g.toString()); 
        // g.let_print();
        System.out.print("\t      All Test PASSED !!\n");
        System.out.println("\n$$________********{ Thank You }**********_________$$\n");
    }

}

