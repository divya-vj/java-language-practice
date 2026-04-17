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
