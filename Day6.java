import org.w3c.dom.Node;

public class Day6 {
    public static void main(String[] args) {
       // Class = blueprint
        class Dog {
            String name;   // field (property)
            int age;       // field

            // Constructor — runs when you create an object
            Dog(String name, int age) {
                this.name = name;
                this.age = age;
            }

            void bark() {          // method (behaviour)
                System.out.println(name + " says: Woof!");
            }
        }

        // Object = actual instance created from blueprint
        Dog d1 = new Dog("Max", 3);
        Dog d2 = new Dog("Bella", 5);
        d1.bark();   // Max says: Woof!
        d2.bark();   // Bella says: Woof! 
            }

    // This is the building block of LinkedList, Trees, etc.
class Node {
    int data;
    Node next;   // pointer to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Creating a linked list manually
Node head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
// 1 → 2 → 3  
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);          // [10]
list.add(20);          // [10, 20]
list.add(1, 15);       // [10, 15, 20] — insert at index 1
list.get(0);           // 10
list.remove(0);        // removes index 0 → [15, 20]
list.size();           // 2
list.contains(15);     // true
Collections.sort(list); // sorts in ascending order

// Loop through
for (int x : list) System.out.println(x);

import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.put("banana", 5);
map.get("apple");          // 3
map.containsKey("mango");  // false
map.getOrDefault("mango", 0);  // 0 — safe get
map.remove("banana");

// Loop
for (String key : map.keySet()) {
    System.out.println(key + " → " + map.get(key));
}

// Classic DSA use — count frequency
String s = "hello";
HashMap<Character, Integer> freq = new HashMap<>();
for (char c : s.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
// freq: {h=1, e=1, l=2, o=1}

import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
set.add(1); set.add(2); set.add(1);  // {1, 2} — no duplicate
set.contains(2);   // true
set.remove(1);     // {2}

// DSA use — check if duplicate exists in array
int[] arr = {1, 2, 3, 2};
HashSet<Integer> seen = new HashSet<>();
for (int x : arr) {
    if (!seen.add(x)) System.out.println("Duplicate: " + x);
}

import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(1);     // [1]
stack.push(2);     // [1, 2]
stack.push(3);     // [1, 2, 3]
stack.peek();      // 3 — look at top without removing
stack.pop();       // removes & returns 3 → [1, 2]
stack.isEmpty();   // false

// DSA use: balanced parentheses check
String s = "({[]})";
Stack<Character> st = new Stack<>();
for (char c : s.toCharArray()) {
    if (c=='(' || c=='{' || c=='[') st.push(c);
    else st.pop();  // simplified
}
System.out.println(st.isEmpty() ? "Valid" : "Invalid");

import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> q = new LinkedList<>();
q.offer(1);    // add to end: [1]
q.offer(2);    // [1, 2]
q.offer(3);    // [1, 2, 3]
q.peek();      // 1 — front element
q.poll();      // removes & returns 1 → [2, 3]

import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5); pq.offer(1); pq.offer(3);
pq.peek();   // 1 — smallest always at top
pq.poll();   // removes 1 → next peek = 3

// Max-heap (largest at top)
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

// Autoboxing — primitive automatically converted to wrapper
ArrayList<Integer> list = new ArrayList<>();
list.add(5);   // 5 is int, Java auto-converts to Integer(5)

// Unboxing — wrapper automatically converted to primitive
int x = list.get(0);   // Integer → int, automatically

// You almost never need to do this manually:
Integer a = Integer.valueOf(10);  // manual boxing (rarely needed)
int b = a.intValue();             // manual unboxing (rarely needed)

Integer.parseInt("123");          // String → int: 123
Integer.toString(45);             // int → String: "45"
Integer.MAX_VALUE;                // 2147483647
Integer.MIN_VALUE;                // -2147483648
Integer.toBinaryString(10);       // "1010"
Integer.max(3, 7);                // 7
Integer.min(3, 7);                // 3
