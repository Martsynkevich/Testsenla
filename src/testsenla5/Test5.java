package testsenla5; 
import java.util.Scanner; 
public class Test5 { 
public static void main (String[] args) { 
Scanner scan = new Scanner(System.in); 
System.out.println("������� �����"); 
String str = scan.nextLine(); 
scan.close(); 
str = str.replaceAll("[^A-Za-z�-��-�]", ""); 
if (str.toLowerCase().equals((new StringBuilder(str)).reverse().toString().toLowerCase())) 
System.out.println("��������� =) ! " + str); 
else 
System.out.println("�� ��������� =( " + str); 
} 
}