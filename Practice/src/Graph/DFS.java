package Graph;

import java.util.List;

public class DFS {
	private int N; // �׷����� ������ ��
	private List<Edge>[] graph;
	private boolean[] visited; // DFS ���� �� �湮�� ������ true�� ����
	
	public DFS(List<Edge>[] adjList) { // ������
		N = adjList.length;
		graph = adjList;
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) { // �ʱ� �迭 false�� ��� �ʱ�ȭ
			visited[i] = false;
		}
		
		for(int i = 0; i < N; i++) { // ������ ������ �湮
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
	
	private void dfs(int i) { // ������ȸ�� ����� ����
		visited[i] = true; // �ڱⲨ �湮������ true
		
		System.out.print(i + " ");
		
		for(Edge e : graph[i]) { // i ��°�� ���� ����Ʈ�� ��� ȣ��
			if(!visited[e.adjvertex]) { // ���� �湮�� �ȵƴٸ�
				dfs(e.adjvertex); // ���ȣ��
			}
		}
	}
}
