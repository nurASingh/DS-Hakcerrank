package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class BFS {
	static boolean[]  status;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int E = sc.nextInt();
		int[][] ar = new int[n][n];
		status = new boolean[n];
		int[] edge = new int[E];
		int connectCount = 0;
		int[] toprint = new int[2*E-1];
		int index =0;
		
		for (int i = 0; i < status.length; i++) {
			 status[i] = false;
		}
		for (int i = 0; i < E; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			ar[start-1][end-1] = weight;
			edge[i] = weight;
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				//System.out.print(ar[i][j] + " ");
			}
			//System.out.println();
		}
		Arrays.sort(edge);
		int W = 0;
		for (int i = 0; i < edge.length; i++) {
			//System.out.println(connectCount +" connectCount");
			if(connectCount == n-1)
				break;
			int[] connectedNodes  = nodes(ar,edge[i]);
			if(connectedNodes[0] == -1 && connectedNodes[1] == -1)
				continue;
			
			if(status[connectedNodes[0]] == true && status[connectedNodes[1]] == true)
				continue;
			else if(status[connectedNodes[0]] == true || status[connectedNodes[1]] == true){
				if(status[connectedNodes[0]] == true){
					toprint[index] = connectedNodes[1];
					index++;
					status[connectedNodes[1]] = true;
					connectCount++;
				}else if(status[connectedNodes[1]] == true){
					toprint[index] = connectedNodes[0];
					index++;
					status[connectedNodes[0]] = true;
					connectCount++;
				}
				W = W + edge[i];
			}else{
				toprint[index] = connectedNodes[0];
				index++;
				toprint[index] = connectedNodes[1];
				index++;
				W = W + edge[i];
				 status[connectedNodes[0]] = true; 
				 status[connectedNodes[1]] = true;
				 connectCount++;
			}
		}
		int missingEdges = 0;
		
		if(connectCount < n-1){
			missingEdges = n-1 -connectCount;
		}
		if(missingEdges > 0)
			W = W + edge[connectCount];
		//System.out.println();
		for (int i = 0; i < toprint.length; i++) {
			//System.out.print(toprint[i] + " ");
		}
		//System.out.println();
		System.out.println(W);
		
	}
	
	public static int[] nodes(int[][] ar, int weight){
		//System.out.println(weight + ":::");
		int[] ar1 = new int[2];
		ar1[0] = -1;
		ar1[1] = -1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if(ar[i][j] == weight && (status[i] == false || status[j] == false)){
					ar1[0] = i;
					ar1[1] =j;
					break;
				}
				if(ar1[0] >= 0)
					break;
			}
		}
		//System.out.println(ar1[0] + ": " + ar1[1]);
		return ar1;
	}

}

