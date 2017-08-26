package testsenla1;
import java.util.Scanner; 
public class Test1 { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("¬ведите простое число"); 
if (!sc.hasNextInt()) { 
sc.nextLine(); 
System.err.println("не число"); 
} else { 
Integer y = sc.nextInt(); 
boolean x = true; 
for (int i = 2; i <= y; i++) { 
for (int j = 2; j < i; j++) { 
if (i % j == 0) { 
x = false; 
break; 
} 
} 
if (x) System.out.println(i); 
x=true; 
} 
} 
} 
}