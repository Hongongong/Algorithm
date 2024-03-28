import java.util.*;

class Node {
	int id; // 노드 번호, 컴퓨터 번호
	List<Node> links; // 인접 리스트
	boolean visited; // 방문여부

	public Node(int id) {
		this.id = id;
		this.links = new LinkedList<>();
	}

	public void link(Node node) {
		links.add(node);
	}

	public void visit() {
		this.visited = true;
	}

	public boolean isVisited() {
		return this.visited;
	}
}

public class Main {
	static int result = 0; // 바이러스 감연된 컴퓨터수를 결과로 리턴

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 노드(컴퓨터)의 수
		int M = sc.nextInt(); // 간선의 수

		Node[] nodes = new Node[N + 1];

		for (int i = 1; i <= N; i++) {
			nodes[i] = new Node(i);
		}

		// 간선 정보를 입력 받음
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			nodes[u].link(nodes[v]);
			nodes[v].link(nodes[u]);
		}

		// 1번 컴퓨터부터 시작해서, DFS 실행
		dfs(nodes);

		// 1번 컴퓨터 자신을 제외하고 감연된 컴퓨터의 수 출력
		System.out.println(result - 1);

		sc.close();
	}

	// DFS 메소드 : stack 사용
	public static void dfs(Node[] nodes) {
		Stack<Node> stack = new Stack<>();

		stack.push(nodes[1]); // 1번 컴퓨터부터 시작
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			current.visit();
			result++;

			for (Node next : current.links) {
				if (next.isVisited())
					continue;
				if (stack.contains(next))
					continue;
				stack.push(next);
			}
		}
	}

}