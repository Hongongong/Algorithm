import java.util.*;

class Solution {
    class Location {
        int x, y;
        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public boolean equals(Location other) {
            return this.x == other.x && this.y == other.y;
        }
        
        Location left() {
            return new Location(x - 1, y);
        }
        Location right() {
            return new Location(x + 1, y);
        }
        Location up() {
            return new Location(x, y + 1);
        }
        Location down() {
            return new Location(x, y - 1);
        }
    }
    
    class Position {
        int steps; // 시작점에서 현재 위치까지 이동한 걸음수
        Location location; // 현재 탐색 중인 위치
        Position(Location l, int s) {
            location = l;
            steps = s;
        }
    }
    
    public int solution(int[][] maps) {
        final int mapSizeX = maps.length; // 맵의 가로 크기
        final int mapSizeY = maps[0].length; // 맵의 세로 크기
        
        final Location target = new Location(mapSizeX - 1, mapSizeY - 1); // 상대진영 좌표
        
        boolean[][] visited = new boolean[mapSizeX][mapSizeY]; // 각 위치 방문 여부
        
        // BFS를 위한 큐
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(new Location(0, 0), 1)); // 첫 번째 위치(첫번째 걸음)
        
        while(!queue.isEmpty()) {
            Position now = queue.poll(); // 현재 위치를 큐에서 꺼냄
            
            
            // 맵 범위 밖으로 벗어나면 다음 위치로 바로 넘어가도록(이번 실행X)
            if(now.location.x < 0) continue; // 맵 밖
            if(now.location.x >= mapSizeX) continue; // 맵 밖
            if(now.location.y < 0) continue; // 맵 밖
            if(now.location.y >= mapSizeY) continue; // 맵 밖
            if(maps[now.location.x][now.location.y] == 0) continue; // 벽
            if(visited[now.location.x][now.location.y]) continue; // 이미 방문한 곳이면
            
            visited[now.location.x][now.location.y] = true;
            
            // 목표 위치에 도달하면
            if(now.location.equals(target)) {
                return now.steps; // 걸음 수 리턴
            }
            
            // 다음 방문할 위치들을 큐에 추가
            queue.offer(new Position(now.location.left(), now.steps + 1));
            queue.offer(new Position(now.location.right(), now.steps + 1));
            queue.offer(new Position(now.location.up(), now.steps + 1));
            queue.offer(new Position(now.location.down(), now.steps + 1));
        }
        
        return -1; // 상대 진영에 도착하지 못할 경우
    }
}