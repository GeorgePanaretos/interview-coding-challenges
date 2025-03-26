import java.util.*;

public class MinOpsCorrect {

    public static List<Integer> getMinOperations(List<Long> targets) {
        List<Integer> result = new ArrayList<>();

        for (Long target : targets) {
            result.add(bfsMinOps(target));
        }

        return result;
    }

    private static int bfsMinOps(Long target) {
        if (target == 1) return 0;

        Queue<Long> queue = new LinkedList<>();
        Set<Long> visited = new HashSet<>();
        queue.add(1L);
        visited.add(1L);
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;

            for (int i = 0; i < size; i++) {
                long curr = queue.poll();

                long next1 = curr + 1;
                long next2 = curr * 2;

                if (next1 == target || next2 == target) return steps;

                if (next1 <= target && visited.add(next1)) queue.add(next1);
                if (next2 <= target && visited.add(next2)) queue.add(next2);
            }
        }

        return -1; // Should never happen
    }

    public static void main(String[] args) {
        List<Long> input = Arrays.asList(1L, 5L, 8L, 15L, 100L);
        List<Integer> output = getMinOperations(input);

        System.out.println("Input: " + input);
        System.out.println("Min operations: " + output);
    }
}
