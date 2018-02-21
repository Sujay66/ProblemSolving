package Easy;

public class JudgeRoute {
    public static void main(String[] args){
        String movement = "UD";
        int up=0,down=0,left=0,right = 0;
       for(int i=0;i<movement.length();i++){
           char a = movement.charAt(i);
           switch (a){
               case 'U': up++;break;
               case 'D': down++;break;
               case 'L': left++;break;
               case 'R': right++;break;
               default: break;
           }
       }
       System.out.print((up==down) && (right==left));
    }
}
