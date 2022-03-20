package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Prims {

    static class Node
    {
        int weight;
        int value;
        ArrayList<Node> neighbor;
        Node(int value,int weight)
        {
            this.value=value;
            this.weight=weight;
            neighbor = new ArrayList<>();
        }
    }

    private void prims(ArrayList<ArrayList<Node>> adj) {
        int n = adj.size();

        boolean[] minTree = new boolean[n];
        int[] wt = new int[n];
        int[] parent = new int[n];

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(0,0));

        while(!pq.isEmpty())
        {
            Node u = pq.poll();

        }


    }

    public static void main(String[] args) {
        int n=5;

        ArrayList<ArrayList<Node>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Node(1,4));
        adj.get(1).add(new Node(0,4));

        adj.get(0).add(new Node(3,5));
        adj.get(3).add(new Node(0,5));

        adj.get(0).add(new Node(2,2));
        adj.get(2).add(new Node(0,2));

        adj.get(3).add(new Node(4,8));
        adj.get(4).add(new Node(3,8));

        adj.get(3).add(new Node(2,6));
        adj.get(2).add(new Node(3,6));

        adj.get(2).add(new Node(4,2));
        adj.get(4).add(new Node(2,2));

        adj.get(1).add(new Node(2,3));
        adj.get(2).add(new Node(1,3));

        Prims algorithm = new Prims();
        algorithm.prims(adj);

    }


}
