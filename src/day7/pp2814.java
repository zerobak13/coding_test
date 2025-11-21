package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pp2814 {
    static List<Integer>[] graph;
    static int max_path;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            visited = new boolean[N + 1];
            graph = new ArrayList[N + 1];
            max_path = 0;
            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 0; i < M; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x].add(y);
                graph[y].add(x);
            }
            for (int i = 1; i <= N; i++) {
                dfs(1, i);
            }
            System.out.println("#" + tc + " " + max_path);
        }

    }

    static void dfs(int length, int v) {
        if (visited[v]) {
            return;
        }
        max_path = Math.max(length, max_path);
        visited[v] = true;
        for (int x : graph[v]) {
            if (!visited[x]) {
                dfs(length + 1, x);
            }
        }
        visited[v] = false;
    }
}
