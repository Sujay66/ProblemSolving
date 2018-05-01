package Easy;

public class PalindromeInteger {
    public static void main(String[] args){
        int x = -121;
        int number = x;
        char flag = '+';
        if(number<0)
        {
            flag = '-';
            Math.abs(number) ;
        }
        int s =0;
        int r;
        while(number!=0){
            r = number%10;
            s = s*10 + r;
            number = number/10;
        }
        if(flag == '-'){
            s= -1*s;
            if(s<Integer.MIN_VALUE){
                System.out.println( false);
            }
        }
        if(s>Integer.MAX_VALUE){
            System.out.println( false);
        }
        if(s==x){
            System.out.println( true);
        }
        System.out.println( false);
    }
}
