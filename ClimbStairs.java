
public class ClimbStairs {
	public static void main(String[] args){
		int n = 4;
		System.out.println(climb(n));
	}

	private static int climb(int n) {
		// TODO Auto-generated method stub
		
		if(n == 0) return 1;
		else if(n == 1) return 1;
		else if(n>=2) return climb(n-1)+climb(n-2);
		else return 0;
		
	}
}
