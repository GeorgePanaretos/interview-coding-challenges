## 📘 Challenge Name: Get Minimum Operations

### 📝 Problem Statement

You are given a list of target numbers. For each target number `n`, starting from the number `1`, your task is to compute the **minimum number of operations** required to reach `n` using **only** the following two operations:

- Add 1 (`+1`)
- Multiply by 2 (`*2`)

You must return a list of integers, where each integer represents the minimum number of operations required to reach the corresponding target number in the input list.

---

### 🔧 Function Signature

```java
public static List<Integer> getMinOperations(List<Long> targets)
```

---

### ✅ Input

- A list of `Long` integers `targets` where `1 <= targets[i] <= 10^9`
- The list can contain up to `10^4` elements

---

### 📤 Output

- Return a list of integers where each value corresponds to the minimum number of operations needed to reach the respective target number.

---

### 🔍 Constraints

- Only `+1` and `*2` operations are allowed
- You **must start from 1** for each target
- Use the **minimum number of operations**

---

### 🧪 Sample Input

```java
List<Long> input = Arrays.asList(1L, 5L, 8L, 15L, 100L);
```

---

### 🎯 Sample Output

```java
[0, 4, 4, 6, 8]
```

---

### 🧠 Explanation

- To reach `1`, no operations needed → 0 steps
- To reach `5`:  
  `1 → 2 → 4 → 5` → 4 steps  
- To reach `8`:  
  `1 → 2 → 4 → 8` → 3 steps, but `1 → 2 → 3 → 6 → 7 → 8` is longer → So 3 steps  
- To reach `15`:  
  One shortest path is `1 → 2 → 4 → 5 → 10 → 11 → 12 → 13 → 14 → 15`  
  But better: `1 → 2 → 3 → 6 → 7 → 14 → 15` → 6 steps  
- To reach `100`:  
  One optimal path requires 8 steps

---

### 💡 Notes

Use **Breadth-First Search (BFS)** from `1` to each target to ensure you find the minimum number of operations. Avoid brute force.
