# 🧮 Sum of Factors for Each Number in a List

### Problem Statement

You are given a list of positive integers. For each integer `n` in the list, calculate the **sum of all positive factors** (also known as **divisors**) of `n`. Return the list of sums corresponding to each input number.

A factor of a number `n` is an integer `d` such that `n % d == 0`.

---

### Function Signature
```java
public static List<Long> sumOfFactorsList(List<Long> numbers)
```

### Input
- A list `numbers` of up to `10^5` elements
- Each element in `numbers` is a positive long integer: `1 ≤ numbers[i] ≤ 10^12`

### Output
- Return a list of long integers, where each element is the sum of factors of the corresponding number in the input list.

---

### Constraints
- Optimize your solution to handle large values efficiently (use `O(√n)` logic).
- Use long integers to avoid overflow.

---

### Example

**Input:**
```
[6, 12, 15, 1000000007]
```

**Output:**
```
[12, 28, 24, 1000000008]
```

---

### Explanation:

- `6` → Factors: 1, 2, 3, 6 → Sum = 12  
- `12` → Factors: 1, 2, 3, 4, 6, 12 → Sum = 28  
- `15` → Factors: 1, 3, 5, 15 → Sum = 24  
- `1000000007` is a prime → Factors: 1, 1000000007 → Sum = 1000000008

---

### Sample Code Stub

```java
import java.util.*;

public class SumOfFactorsForEach {
    public static List<Long> sumOfFactorsList(List<Long> numbers) {
        // Your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Long> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(scanner.nextLong());
        }

        List<Long> result = sumOfFactorsList(input);
        for (Long sum : result) {
            System.out.println(sum);
        }
    }
}
```

---

### Notes
- Efficient implementation is necessary for large inputs.
- You may assume all numbers are positive and within the specified bounds.
