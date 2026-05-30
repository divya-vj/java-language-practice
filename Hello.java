//  String Reversal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        String reversed = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        
        System.out.println("Reversed: " + reversed);
    }
}

//Palindrome Check

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        // Convert to lowercase so "Madam" and "madam" both work
        s = s.toLowerCase();
        
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        
        if (s.equals(reversed)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is NOT a Palindrome");
        }
    }
}

// Count Vowels and Consonants

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String s = sc.nextLine().toLowerCase();
        
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                // only count letters, skip spaces and special characters
                consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

//Anagram Check

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String s1 = sc.nextLine().toLowerCase();
        
        System.out.println("Enter second string:");
        String s2 = sc.nextLine().toLowerCase();
        
        // If lengths differ they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("NOT Anagrams");
            return;
        }
        
        // Convert to char array, sort, compare
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("NOT Anagrams");
        }
    }
}

// Find Largest Element

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0]; // assume first is largest
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
    }
}

//Second Largest Element

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}

//Sum and Average of Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

//Find Duplicates in Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Duplicate elements:");
        boolean foundAny = false;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    foundAny = true;
                    break;
                }
            }
        }
        
        if (!foundAny) {
            System.out.println("No duplicates found");
        }
    }
}

Create a Student class with name, age, and CGPA. Create two student objects and print their details.
javapublic class Main {

    // Define the class
    static class Student {
        String name;
        int age;
        double cgpa;

        // Constructor
        public Student(String name, int age, double cgpa) {
            this.name = name;
            this.age = age;
            this.cgpa = cgpa;
        }

        // Method to display details
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("CGPA: " + cgpa);
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        // Create two objects
        Student s1 = new Student("Divya", 21, 8.5);
        Student s2 = new Student("Rahul", 22, 7.8);

        // Call display method on each
        s1.display();
        s2.display();
    }
}
Expected output:
Name: Divya
Age: 21
CGPA: 8.5
---
Name: Rahul
Age: 22
CGPA: 7.8

Create an Employee class with private fields — name, department, salary. Add getters and setters. Create an object, set values using setters, and print using getters.
javapublic class Main {

    static class Employee {
        private String name;
        private String department;
        private double salary;

        // Getters
        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setSalary(double salary) {
            if (salary > 0) {
                this.salary = salary;
            } else {
                System.out.println("Invalid salary");
            }
        }

        // Method to display
        public void display() {
            System.out.println("Employee: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Divya");
        e1.setDepartment("AI Engineering");
        e1.setSalary(45000);

        e1.display();

        System.out.println("\nUsing getters:");
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}

Problem: Create an Employee class with name, salary, and department. Add a method called appraise() that increases salary by 10%. Create two employee objects and call appraise on both. Print salary before and after.
javapublic class Main {

    static class Employee {
        private String name;
        private double salary;
        private String department;

        public Employee(String name, double salary,
                       String department) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }

        // Appraise method — increases salary by 10%
        public void appraise() {
            double increment = salary * 0.10;
            salary = salary + increment;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Divya", 40000, "AI");
        Employee e2 = new Employee("Rahul", 35000, "Java");

        System.out.println("Before appraisal:");
        e1.display();
        e2.display();

        // Apply appraisal
        e1.appraise();
        e2.appraise();

        System.out.println("\nAfter appraisal:");
        e1.display();
        e2.display();
    }
}
Expected output:
Before appraisal:
Name: Divya
Department: AI
Salary: 40000.0
...
After appraisal:
Name: Divya
Department: AI
Salary: 44000.0

Program 4 — Previous Year Confirmed: Bank Account Class
Reported pattern — real world OOP — 25 minutes
Problem: Create a BankAccount class with account number, holder name, and balance. Add methods — deposit(amount), withdraw(amount), and displayBalance(). Validate that deposit and withdrawal amounts are positive. Withdrawal should fail if balance is insufficient.
javapublic class Main {

    static class BankAccount {
        private String accountNumber;
        private String holderName;
        private double balance;

        public BankAccount(String accountNumber,
                          String holderName,
                          double balance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount");
            } else {
                balance = balance + amount;
                System.out.println("Deposited: " + amount);
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            }
        }

        public void displayBalance() {
            System.out.println("Account: " + accountNumber);
            System.out.println("Holder: " + holderName);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SB001",
                                          "Divya", 10000);

        acc.displayBalance();

        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(20000); // should say insufficient
        acc.withdraw(-500);  // should say invalid

        System.out.println("\nFinal:");
        acc.displayBalance();
    }
}
Expected output:
Account: SB001
Holder: Divya
Balance: 10000.0
Deposited: 5000.0
Withdrawn: 3000.0
Insufficient balance
Invalid withdrawal amount

Final:
Account: SB001
Holder: Divya
Balance: 12000.0

Program 5 — Code Skeleton Practice
This is how the actual exam looks — 15 minutes
This is the most important program of Day 3. The qualifier gives you a skeleton — you fill in the logic. Practice this format now so it feels familiar on June 4.

public class Solution {

    static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }

        public void display() {
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: "
                               + getPerimeter());
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.0, 5.0);
        r.display();
    }
}
Expected output:
Length: 10.0
Width: 5.0
Area: 50.0
Perimeter: 30.0