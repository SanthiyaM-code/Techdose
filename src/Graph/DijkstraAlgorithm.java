package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<GraphNode>> a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(new ArrayList<>());
        }
        a.get(0).add(new GraphNode(1,2));
        a.get(1).add(new GraphNode(0,2));

        a.get(1).add(new GraphNode(2,4));
        a.get(2).add(new GraphNode(0,2));

        a.get(0).add(new GraphNode(3,1));
        a.get(3).add(new GraphNode(0,1));

        a.get(3).add(new GraphNode(2,3));
        a.get(2).add(new GraphNode(3,3));

        a.get(1).add(new GraphNode(4,5));
        a.get(4).add(new GraphNode(1,5));

        a.get(2).add(new GraphNode(4,1));
        a.get(4).add(new GraphNode(2,1));

        DijkstraAlgorithm obj = new DijkstraAlgorithm();

        System.out.println(Arrays.toString(obj.shortestPath(0,a,n)));



    }

    private int[] shortestPath(int src, ArrayList<ArrayList<GraphNode>> adj, int n)
    {
        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;


        PriorityQueue<GraphNode> pq = new PriorityQueue<>(Comparator.comparing(nodeg -> nodeg.weight));
        pq.add(new GraphNode(src,0));

        while (!pq.isEmpty())
        {
            GraphNode u = pq.poll();
//            System.out.println(pq.toString());
            for( GraphNode v : adj.get(u.value))
            {

                if(u.weight+v.weight < distance[v.value])
                {
                    distance[v.value] = u.weight +v.weight;
                    pq.add(new GraphNode(v.value,distance[v.value]));
                }

            }
        }
        return  distance;

    }

    private static class GraphNode {
        int value;
        int weight;
        GraphNode(int value,int weight)
        {
            this.value=value;
            this.weight=weight;
        }
    }
}
