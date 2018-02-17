package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JustForTesting {
    public static void main(String[] args){
        String s = "               ++56asdsadasd8786768";
        s = s.trim();
        Matcher matcher ;
     //   System.out.print(s.matches("[+]+[0-9]*.*"));
        if(s.matches("[+][0-9]*.*")){
            Pattern pattern = Pattern.compile("[+][0-9]*");
             matcher = pattern.matcher(s);
            if (matcher.find())
            {
                System.out.println(matcher.group());
            }
        }else if(s.matches("[-]+[0-9]*.*")){
            Pattern pattern = Pattern.compile("[-]+[0-9]*");
             matcher = pattern.matcher(s);
            if (matcher.find())
            {
                System.out.println(matcher.group(0));
            }
        }else{
            System.out.print("Invalid string");
        }

     //   matcher.g


    }
}
