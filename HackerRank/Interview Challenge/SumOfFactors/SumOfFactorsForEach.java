import java.io.*;
import java.util.*;

public class SumOfFactorsForEach {

    public static List<Long> sumOfFactorsList(List<Long> numbers) {
        List<Long> result = new ArrayList<>(numbers.size());
        for (long n : numbers) {
            result.add(sumOfFactors(n));
        }
        return result;
    }

    private static long sumOfFactors(long n) {
        long sum = 0;
        long sqrt = (long) Math.sqrt(n);
        for (long i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                long other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        // Fast input reader for large data
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine().trim());

        List<Long> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(Long.parseLong(reader.readLine().trim()));
        }

        List<Long> results = sumOfFactorsList(numbers);

        // Fast output
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Long result : results) {
            writer.write(result.toString());
            writer.newLine();
        }
        writer.flush();
    }
}
