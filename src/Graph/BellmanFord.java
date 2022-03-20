package Graph;

import java.util.Arrays;

public class BellmanFord {

    public static void main(String[] args) {
        int[][] edges = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int src=2;

        int[] parent = new int[n+1];
        int[] cost = new int[n+1];
        Arrays.fill(parent,Integer.MAX_VALUE);
        Arrays.fill(cost,Integer.MAX_VALUE);
        parent[src] = -1;
        cost[src] = 0;

        boolean isChanged = false;

        for(int i=0;i<n-1;i++) {
            isChanged = false;
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];
                if (cost[u] + weight < cost[v]) {
                    cost[v] = cost[u] + weight;
                    parent[v] = u;
                    isChanged = true;
                }
            }
            if (!isChanged)
                break;
        }

        for(int i=0;i< edges.length && isChanged; i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            int weight = edges[i][2];
            if (cost[u] + weight < cost[v]) {
                cost[v] = cost[u] + weight;
                parent[v] = u;
                System.out.print("Loop detected");
                return;
            }
        }

        System.out.println(Arrays.toString(cost));
        System.out.println(Arrays.toString(parent));


    }

}
