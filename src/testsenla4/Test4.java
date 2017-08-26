package testsenla4; 
import java.io.PrintWriter; 

//This is sample program to calculate the GCD and LCM of two given numbers 
import java.util.Scanner; 

public class Test4 
{ 
static int gcd(int x, int y) 
{ 
int r=0, a, b; 
a = (x > y) ? x : y; // a is greater number 
b = (x < y) ? x : y; // b is smaller number 

r = b; 
while(a % b != 0) 
{ 
r = a % b; 
a = b; 
b = r; 
} 
return r; 
} 

static int lcm(int x, int y) 
{ 
int a; 
a = (x > y) ? x : y; // a is greater number 
while(true) 
{ 
if(a % x == 0 && a % y == 0) 
return a; 
++a; 
} 
} 

public static void main(String args[]) 
{ 
Scanner input = new Scanner(System.in); 
System.out.println("ВВедите 2 числа: "); 
int x = input.nextInt(); 
int y = input.nextInt(); 

System.out.println("НОТ двух чисел: " + gcd(x, y)); 
System.out.println("НОК двух чисел: " + lcm(x, y)); 
input.close(); 
} 
}