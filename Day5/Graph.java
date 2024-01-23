package Day5;
import java.util.ArrayList;
public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;


    public Graph(ArrayList<GraphNode> nodeList)
    {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];

    }

    public void addundirectedEdge(int i , int j )
    {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    


}
