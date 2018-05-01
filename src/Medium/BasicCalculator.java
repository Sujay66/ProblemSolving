package Medium;

public class BasicCalculator {
    public int basicCalculator(String s){
        if(s.length() == 0 || s.trim().length() == 0) return 0;

        int sum = 0;
        int prevNumber = 0;
        char curOp = '+';

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') continue;

            if(Character.isDigit(s.charAt(i))){

                int val = s.charAt(i)-'0';
                while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))){
                    val = val * 10 + (s.charAt(i+1) - '0');
                    i++;
                }

                if(curOp == '+'){
                    sum = sum + prevNumber;
                    prevNumber = val;
                }else if(curOp == '-'){
                    sum = sum + prevNumber;
                    prevNumber = -val;
                }else if(curOp == '*'){
                    prevNumber = prevNumber * val;
                }else if(curOp == '/'){
                    prevNumber = prevNumber / val;
                }

            }else{
                curOp = s.charAt(i);
            }
        }
        sum = sum + prevNumber;
        return sum;
    }

    public static void main(String[] args){
        BasicCalculator b = new BasicCalculator();
        System.out.println(b.basicCalculator("252-78"));
    }
}
