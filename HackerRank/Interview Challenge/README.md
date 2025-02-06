---

## **📌 Problem Description: Longest Bitonic Subarray**

### **📝 Overview**
A **bitonic subarray** is a subarray in which elements first **increase** and then **decrease**. The goal of this problem is to find the **length** of the longest bitonic subarray in a given list of integers.

### **💡 Problem Statement**
Given an **array of integers**, determine the length of the **longest contiguous bitonic subarray**.

### **🔍 Definition**
- A **subarray** is a contiguous part of an array.
- A **bitonic subarray** is a sequence where:
  1. Elements **strictly increase** in the beginning.
  2. After reaching a peak element, they **strictly decrease**.

### **🔢 Example**
#### **Example 1**
**Input:**  
```
arr = [1, 2, 5, 3, 2, 8, 6, 4]
```
**Output:**  
```
5
```
**Explanation:**  
The longest bitonic subarray is `[1, 2, 5, 3, 2]`, which has a length of **5**.

#### **Example 2**
**Input:**  
```
arr = [12, 4, 78, 90, 45, 23]
```
**Output:**  
```
5
```
**Explanation:**  
The longest bitonic subarray is `[4, 78, 90, 45, 23]` with length **5**.

### **🎯 Constraints**
- \(1 \leq N \leq 10^5\) (where **N** is the size of the array)
- \( -10^9 \leq arr[i] \leq 10^9 \) (array elements can be large)

### **🚀 Expected Time Complexity**
- The solution should ideally run in **O(N) time complexity**.

### **🔧 Input & Output Format**
#### **Input Format**
- The first line contains an integer \( N \) (size of the array).
- The second line contains \( N \) space-separated integers.

#### **Output Format**
- Print the length of the **longest bitonic subarray**.

---
