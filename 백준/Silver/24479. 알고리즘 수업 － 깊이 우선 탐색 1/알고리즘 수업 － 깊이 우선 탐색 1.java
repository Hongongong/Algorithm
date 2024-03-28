
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Node {
	int id;
	List<Node> links; // 인접리스트
	boolean visited; // 방문 여부

	public Node(int id) {
		this.id = id;
		this.links = new ArrayList<>();
	}

	void link(Node node) {
		links.add(node);
	}

	void visit() {
		visited = true;
	}

	boolean isVisited() {
		return visited;
	}

}

public class Main {
	static Node[] nodes; // 모든 노드를 저장할 배열
	static int[] visitOrder; // 노드의 방문 순서를 저장할 배열
	static int order = 1; // 방문 순서 카운팅

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 노드 개수
		int M = sc.nextInt(); // 간선 개수
		int R = sc.nextInt(); // 시작 노드

		nodes = new Node[N + 1]; // 노드 번호 1부터 시작
		visitOrder = new int[N + 1]; // 방문 순서 배열 초기화

		for (int i = 1; i <= N; i++) {
			nodes[i] = new Node(i); // 각 노드 초기화
		}

		// 간선 정보 입력
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			nodes[u].link(nodes[v]); // 무방향 그래프 이므로 양방향으로 링크
			nodes[v].link(nodes[u]);
		}

		// 모든 Node의 인접 정점을 오름차순으로 정렬
		for (int i = 1; i <= N; i++) {
			Collections.sort(nodes[i].links, Comparator.comparingInt(n -> n.id)); // id 기준 오름차순
		}

		// DFS 시작
		dfs(nodes[R]);

		for (int i = 1; i <= N; i++) {
			System.out.println(visitOrder[i]); // 노드 방문 순서
		}

	}

	static void dfs(Node node) {
		if (node.isVisited())
			return; // base case;

		node.visit(); // 현재 노드 방문 처리
		visitOrder[node.id] = order++; // 방문 순서 기록

		for (Node linkedNode : node.links) {
			dfs(linkedNode); // 연결된 모든 노드에 대해 DFS 수행(재귀 호출)
		}
	}

}
