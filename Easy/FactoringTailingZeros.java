package Easy;

public class FactoringTailingZeros {
	public static void main(String[] args){
		int n = 1808548329;
		int count = 0;
		int i =5;
		 while (n>=5) {
			    n/=5;
			    count+=n;
			  }
		System.out.println(count);
	}

}
