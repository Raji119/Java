package DataStructures;

public class UnDirectedGraphArray {
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(5, 3);
        System.out.println(g);
    }
}


class Graph{
    private int V;
    private int E;
    private int[][] adjMatrix;

    public Graph(int nodes){
        this.V=nodes;
        this.adjMatrix=new int[V+1][V+1];
        this.E=0;
    }

    public void addEdge(int u,int v){
        if(u>=V || v>=V){
            System.out.println("Invalid Edge");
            return;
        }
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V + " vertices " + E + " edges \n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for(int w:adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}