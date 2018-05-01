package Medium;

import java.util.HashMap;

public class BullsAndCows {
   /* public String getHint(String secret, String guess) {
        HashMap<Character,Integer> count = new HashMap<>();
        HashMap<Character,Integer> position = new HashMap<>();
        int bull = 0;
        int cow = 0;

        for(int i=0;i<secret.length();i++){
            // position.put(guess.charAt(i),i);
            if(count.containsKey(secret.charAt(i))){
                count.put(secret.charAt(i),count.get(secret.charAt(i))+1);
                position.put(secret.charAt(i),position.get(secret.charAt(i))+1);
            }else{
                count.put(secret.charAt(i),1);
                position.put(secret.charAt(i),1);
            }
        }

        for(int i=0;i<guess.length();i++){
            if(count.containsKey(guess.charAt(i))){
                if(secret.charAt(i) == guess.charAt(i)){
                    bull++;
                    count.put(guess.charAt(i),count.get(guess.charAt(i))-1);
                    position.put(guess.charAt(i),position.get(guess.charAt(i))-1);
                }
                else if(count.containsKey(guess.charAt(i)) && count.get(guess.charAt(i)) == position.get(guess.charAt(i))){
                    if(count.get(guess.charAt(i))>0){
                        cow++;
                        count.put(guess.charAt(i),count.get(guess.charAt(i))-1);
                    }
                }else if(position.get(guess.charAt(i))>0){
                    cow++;
                    position.put(guess.charAt(i),position.get(guess.charAt(i))-1);
                }
            }

        }

        return Integer.toString(bull) + "A" + Integer.toString(cow) + "B";

    }
*/
   public String getHint(String secret, String guess) {
       int len = secret.length();
       int[] secretarr = new int[10];
       int[] guessarr = new int[10];
       int bull = 0, cow = 0;
       for (int i = 0; i < len; ++i) {
           if (secret.charAt(i) == guess.charAt(i)) {
               ++bull;
           } else {
               ++secretarr[secret.charAt(i) - '0'];
               ++guessarr[guess.charAt(i) - '0'];
           }
       }
       for (int i = 0; i < 10; ++i) {
           cow += Math.min(secretarr[i], guessarr[i]);
       }
       return "" + bull + "A" + cow + "B";
   }
    public static void main(String[] args){
        BullsAndCows bullsAndCows = new BullsAndCows();
        System.out.println(bullsAndCows.getHint("1123","0111"));
    }
}
