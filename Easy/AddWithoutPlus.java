package Easy;

public class AddWithoutPlus {
	
	public static void main(String[] args){
		int a = 2, b = 3, carry = 0;
		
		
		while(b!=0){
			carry = a & b;
			System.out.println("before"+a);
			a = a ^ b;
			System.out.println("after"+a);
			b = carry << 1;
			System.out.println(b);
		}
		
		System.out.println(a);
	}

}
