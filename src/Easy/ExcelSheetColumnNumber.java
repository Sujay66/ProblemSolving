package Easy;

public class ExcelSheetColumnNumber {
	
	public static void main(String[] args){
		String s = "AA";
		s = s.toUpperCase();
        double sum = 0, count = 0;
        for(int i=s.length()-1;i>=0;i--){
            double temp = s.charAt(i) - 64;
            System.out.println(temp);
            sum = sum + (Math.pow(26.0,count)*temp);
            count++;
        }
        System.out.println((int)sum);
	}

}
