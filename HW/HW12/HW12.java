public class HW12 {
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int[][] map = new int[n][n];
        int cost = 0;
        boolean[] visit = new boolean[n];

        for (int[] pipe : pipes) {
            int from = pipe[0] - 1;
            int to = pipe[1] - 1;
            map[from][to] = pipe[2];
            map[to][from] = pipe[2];
        }

        int minEdge;
        int nextIndex;

        while (true) {
            minEdge = Integer.MAX_VALUE;
            nextIndex = -1;
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    for (int j = 0; j < n; j++) {
                        if (visit[j] && map[i][j] != 0 && map[i][j] < minEdge) {
                            minEdge = map[i][j];
                            nextIndex = i;
                        }
                    }
                    if (wells[i] < minEdge && !visit[i]) {
                        minEdge = wells[i];
                        nextIndex = i;
                    }
                }
            }
            if (nextIndex == -1) {
                break;
            }
            cost += minEdge;
            visit[nextIndex] = true;
        }

        return cost;
    }



	public static void main(String[] args) {
		// Test case 1
		int n1 = 3;
		int[] wells1 = {1, 2, 2};
		int[][] pipes1 = {{1, 2, 1}, {2, 3, 1}, {1, 3, 2}};
		// Expected result: 3
		testAndPrintResult(n1, wells1, pipes1);

		// Test case 2
		int n2 = 4;
		int[] wells2 = {1, 2, 3, 4};
		int[][] pipes2 = {{1, 2, 1}, {2, 3, 2}, {3, 4, 3}, {4, 1, 4}};
		// Expected result: 7
		testAndPrintResult(n2, wells2, pipes2);

		// Test case 3
		int n3 = 5;
		int[] wells3 = {5, 5, 5, 5, 5};
		int[][] pipes3 = {{1, 2, 3}, {2, 3, 2}, {3, 4, 4}, {4, 5, 1}, {5, 1, 2}};
		// Expected result: 13
		testAndPrintResult(n3, wells3, pipes3);

		// Test case 4
		int n4 = 4;
		int[] wells4 = {1, 2, 1, 3};
		int[][] pipes4 = {{1, 2, 5}, {2, 3, 7}, {3, 4, 9}, {4, 1, 3}};
		// Expected result: 7
		testAndPrintResult(n4, wells4, pipes4);

		// Test case 5
		int n5 = 4;
		int[] wells5 = {2, 1, 2, 3};
		int[][] pipes5 = {{1, 2, 5}, {2, 3, 2}, {3, 4, 4}, {4, 1, 3}};
		// Expected result: 8
		testAndPrintResult(n5, wells5, pipes5);

		// Test case 6
		int n6 = 6;
		int[] wells6 = {1, 2, 1, 3, 4, 2};
		int[][] pipes6 = {{1, 2, 5}, {2, 3, 2}, {3, 4, 4}, {4, 5, 1}, {5, 6, 3}, {6, 1, 2}};
		// Expected result: 10
		testAndPrintResult(n6, wells6, pipes6);
	}

	public static void testAndPrintResult(int n, int[] wells, int[][] pipes) {
		int result = HW12.minCostToSupplyWater(n, wells, pipes);
		System.out.println("Test case result: " + result);      
	}
}
