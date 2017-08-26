package testsenla2;
import java.util.Scanner;
public class Test2 { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("¬ведите число"); 
if (!sc.hasNextInt()) { 
sc.nextLine(); 
System.err.println("не число"); 
} else { 
Integer y = sc.nextInt(); 

int a = 1, b = 1; 
System.out.print(a + " " + b); 
int fib = 2, i = 2; 
while (i < y) { 
fib = a + b; 
a = b; 
b = fib; 

System.out.print(" "+fib); 
i++; 
{ 
if(fib+fib>y) break; 

} 
} 
} 
} 
}