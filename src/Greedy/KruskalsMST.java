package Greedy;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int src;
    int des;
    int w;
	@Override
	public int compareTo(Edge o) {
		return this.w - o.w;
	}
  }

public class KruskalsMST {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		Edge input[] = new Edge[E];
		for(int i = 0; i < E; i++) {
			input[i] = new Edge();
			input[i].src = s.nextInt();
			input[i].des = s.nextInt();
			input[i].w = s.nextInt();
		}
		kruskals(input, V);
	}

	private static void kruskals(Edge[] input, int v) {
		Arrays.sort(input);
		Edge output[] = new Edge[v - 1];
		int i = 0;
		int count = 0;
		int parent[] = new int[v];
		for(int j = 0; j < v; j++) {
			parent[j] = j;
		}
		while(count < v - 1) {
			Edge c = input[i];
			int srcParent = findParent(parent, c.src);
			int desParent = findParent(parent, c.des);
			if(srcParent != desParent) {
				output[count] = c;
				count++;
				parent[srcParent] = desParent;
			}
			i++;
		}
		for(int j = 0; j < v - 1; j++) {
			if(output[j].src < output[j].des) {
				System.out.println(output[j].src + " " + output[j].des + " " + output[j].w);
			}
			else {
				System.out.println(output[j].des + " " + output[j].src + " " + output[j].w);
			}
		}
		
	}

	private static int findParent(int[] parent, int src) {
		if(parent[src] == src) {
			return src;
		}
		return findParent(parent, parent[src]);
	}

}
/*
Sample Input
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output
1 2 1
0 1 3
0 3 5
*/