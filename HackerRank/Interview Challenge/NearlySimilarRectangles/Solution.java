import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'nearlySimilarRectangles' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
     */

   public static long nearlySimilarRectangles(List<List<Long>> sides) {
    Map<String, Long> ratioCount = new HashMap<>();
    long result = 0;

    for (List<Long> side : sides) {
        long a = side.get(0);
        long b = side.get(1);

        long gcd = gcd(a, b);
        long normalizedA = a / gcd;
        long normalizedB = b / gcd;

        String key = normalizedA + ":" + normalizedB;

        // Add to result the number of rectangles already seen with same ratio
        result += ratioCount.getOrDefault(key, 0L);

        // Update map
        ratioCount.put(key, ratioCount.getOrDefault(key, 0L) + 1);
    }

    return result;
}

// Helper method to compute greatest common divisor
private static long gcd(long a, long b) {
    while (b != 0) {
        long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sidesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int sidesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Long>> sides = new ArrayList<>();

        IntStream.range(0, sidesRows).forEach(i -> {
            try {
                sides.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Long::parseLong)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.nearlySimilarRectangles(sides);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
