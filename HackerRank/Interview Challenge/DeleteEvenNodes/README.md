## 🧾 Problem Statement

**Delete Even Nodes from a Singly Linked List**

You are given the head of a singly linked list. Your task is to delete all the nodes that contain **even integer values**, and return the head of the updated list.

---

### 🧠 Function Signature

```java
Node deleteEvenNodes(Node head)
```

---

### 📥 Input Format

The input is a singly linked list where each node contains an integer value.

- The first line contains an integer `n`, the number of nodes in the list.
- The second line contains `n` space-separated integers, representing the node values in order.

---

### 📤 Output Format

Print the updated linked list with **only odd values**, separated by `" -> "` (space-dash-greater-than-space). If the list is empty after removal, print `"EMPTY"`.

---

### 📌 Constraints

- 0 ≤ n ≤ 10^4  
- -10^9 ≤ Node.data ≤ 10^9

---

### 🧪 Sample Input

```
7
2 4 5 6 7 8 9
```

### ✅ Sample Output

```
5 -> 7 -> 9
```

---

### 🛠 Explanation

- The original list: `2 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9`
- After deleting even nodes: `5 -> 7 -> 9`

---

## 🧩 Sample Java Class

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## 🧰 Helper Functions (Optional)

You may implement the following helper methods in your main class for testing:

- `Node createList(int[] values)`
- `void printList(Node head)`

---

## 🔁 Sample Main Method

```java
public static void main(String[] args) {
    int[] values = {2, 4, 5, 6, 7, 8, 9};
    Node head = createList(values);

    head = deleteEvenNodes(head);
    printList(head);  // Output: 5 -> 7 -> 9
}
```
