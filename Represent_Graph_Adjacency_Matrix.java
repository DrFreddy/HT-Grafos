public class Represent_Graph_Adjacency_Matrix 
{
    private final int vertices;
    private int[][] adjacency_matrix;
 
    public Represent_Graph_Adjacency_Matrix(int v) 
    {
        vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
    }
 
    public void makeEdge(int to, int from, int edge) 
    {
        try 
        {
            adjacency_matrix[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("The vertices does not exists");
        }
    }
 
    public int getEdge(int to, int from) 
    {
        try 
        {
            return adjacency_matrix[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index) 
        {
            System.out.println("The vertices does not exists");
        }
        return -1;
    }
}