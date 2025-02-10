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
     * Complete the 'longestBitonicSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestBitonicSubarray(List<Integer> arr) {
    
        int n = arr.size();
        if(n == 0) return 0;
        
        ArrayList<Integer> increaseArr = new ArrayList<>(n);
        ArrayList<Integer> decreaseArr = new ArrayList<>(n);
        
        for(int i = 0; i < n; i++){
            increaseArr.add(1);
            decreaseArr.add(1);
        }
        
        for(int i = 1; i < n; i++){
            if(arr.get(i) > arr.get(i - 1)){
                increaseArr.set(i,increaseArr.get(i - 1) + 1);
            }
        }
        
        for(int i = n - 2; i >= 0; i--){
            if(arr.get(i) > arr.get(i + 1)){
                decreaseArr.set(i, decreaseArr.get(i + 1) + 1);
            }
        }
        
        int maxLength = 1;
        for(int i = 0; i < n; i++){
            maxLength = Math.max(maxLength, increaseArr.get(i) + decreaseArr.get(i) - 1);
        }
        
        return maxLength;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.longestBitonicSubarray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
