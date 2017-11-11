package Easy;
import java.util.Scanner;

public class ValidPalindrome {
	
	public static void main(String[] args){
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
		
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(actual);
        String rev = new StringBuffer(actual).reverse().toString();
        System.out.println(actual.equals(rev));
	}

}
