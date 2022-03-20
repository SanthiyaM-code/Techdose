package Graph;

import java.util.*;


public class Graph {

     static class Node
     {
        int value;
        List<Node> neighbors;
        Node(int value) {
            this.value = value;
            neighbors = new ArrayList<>();
        }
        void addEdge(Node node)
        {
            neighbors.add(node);
        }
    }

    static void dfs(Node node, Set<Node> visited)
    {
        System.out.print(node.value+" ");
        visited.add(node);
        for(Node n: node.neighbors)
        {
            if(!visited.contains(n))
            {
                dfs(n,visited);
            }
        }
    }

    static void dfs(Node node)
    {
        Stack<Node> stack = new Stack<>();
        Set<Node> set = new HashSet<>();
        stack.add(node);
        while(!stack.empty()) {
            Node curr = stack.pop();
            if(!set.contains(curr)) {
                set.add(curr);
                System.out.println(curr.value + " ");
            }

            for(Node n: curr.neighbors)
            {
                if(!set.contains(n))
                stack.push(n);
            }

        }
    }

    static void bfs(Node node)
    {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Node curr=queue.poll();
            if(!set.contains(curr))
            {
                System.out.print(curr.value+" ");
                set.add(curr);
            }
            for (Node n : curr.neighbors)
            {
                if(!set.contains(n))
                {
                    queue.add(n);
                }
            }

        }
    }


    public static void main(String[] args) {
         Node n1=new Node(1) ;
         Node n2=new Node(2) ;
         Node n3=new Node(3) ;
         Node n4=new Node(4) ;
         Node n5 = new Node(5);

         n1.addEdge(n2);
         n1.addEdge(n3);
         n2.addEdge(n4);
         n4.addEdge(n5);

         dfs(n1,new HashSet<Node>());



     }

}
