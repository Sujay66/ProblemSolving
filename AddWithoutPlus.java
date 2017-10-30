
public class AddWithoutPlus {
	
	public static void main(String[] args){
		int a = 2, b = 3, carry = 0;
		
		
		while(b!=0){
			carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		
		System.out.println(a);
	}

}
