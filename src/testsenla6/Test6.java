package testsenla6; 
import java.util.Scanner; 
public class Test6 { 
public static void main(String[] args) { 
Scanner scan = new Scanner(System.in); 
System.out.println("������� �����"); 
String index = scan.nextLine(); 
scan.close(); 
String[] find = {"0","1","2","3","4","5","6","7","8","9"}; 
for (String temp : find) 
index = index.replace(temp, ""); 
System.out.println("Result : " + new String(index).replaceAll("\\srt", "")); 
} 
}