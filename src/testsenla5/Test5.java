package testsenla5; 
import java.util.Scanner; 
public class Test5 { 
public static void main (String[] args) { 
Scanner scan = new Scanner(System.in); 
System.out.println("введите слово"); 
String str = scan.nextLine(); 
scan.close(); 
str = str.replaceAll("[^A-Za-zА-Яа-я]", ""); 
if (str.toLowerCase().equals((new StringBuilder(str)).reverse().toString().toLowerCase())) 
System.out.println("Полиндром =) ! " + str); 
else 
System.out.println("Не полиндром =( " + str); 
} 
}