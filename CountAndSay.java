public class CountAndSay{
	public static void main(String[] args){
		int n = 5;
		System.out.println(findSequence(n));
	}

	private static String findSequence(int n) {
		// TODO Auto-generated method stub
		int count;
		String reference = "1";
		String temp = new String();
		int num = 1;
		if(n<1) return null;
		if(n==1) return "1";
		while(num<n){
		
			count = 1;
			for(int i=1;i<reference.length();i++){
				if(reference.charAt(i)== reference.charAt(i-1)){
					count++;
				}else{
					temp = temp + String.valueOf(count) + reference.charAt(i-1);
					count = 1;
				}
			}
			temp =  temp + String.valueOf(count) + reference.charAt(reference.length()-1);
			reference = temp;
			temp = "";
			num++;
		}
			
		return reference;
	}
}