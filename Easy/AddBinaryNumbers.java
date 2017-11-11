package Easy;

public class AddBinaryNumbers {
	public static void main(String[] args){
		
		String a = "1000";
		String b = "1111";
		
		String result = "";
		
	//	System.out.println(1%2);
		
		int alength = a.length();
		int blength = b.length();
		
		int p = 0;
		int q = 0;
		int temp;
		int carry = 0;
		
		int longestNumber = alength>blength ? alength:blength;
		
		for(int i=0;i<longestNumber;i++){
			
			p = 0;
			q = 0;
			if(i<alength){
			p = a.charAt(alength-1-i) - '0';
			}
			if(i < blength){
			q = b.charAt(blength-1-i) - '0';
			}
			
			temp = p + q + carry;
			carry = temp / 2;
			result = result + (temp % 2);
		}
		
		result = carry > 0 ? result+1:result;
		
		String fString = new StringBuilder(result).reverse().toString();
		System.out.println(fString);
	}
}
