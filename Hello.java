// syntax of strings

String varName="value";

String name="div";

System.out.println(name);

System.out.println(name.length());

String text = "Hello World";

System.out.println(text.length()); // space is also counted

J  a  v  a
0  1  2  3 // index starts from zero

String word ="good";
System.out.println(word.charAt(1));//0

System.out.println(word.indexOf('g'));//0

System.out.println(text.indexOf('z'));//-1

String text = "JavaProgramming";

System.out.println(text.substring(4));//programming

System.out.println(text.substring(1,3));//av

System.out.println(text.toLowerCase());

System.out.println(text.toUpperCase());

String first = "Hello";
String second = "World";

System.out.println(first + second);

int age = 21;

System.out.println("Age is " + age);