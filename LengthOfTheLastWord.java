
public class LengthOfTheLastWord {
		public static void main(String[] args){
			
			String s = "a ";
			System.out.println(findLength(s));
		}

		private static int findLength(String s) {
			boolean containsAlphabet = false;
	        if(s.trim().length() == 0) return 0;
	        int count = 0;
	        for(int i = s.length()-1;i>=0;i--){
	            if (s.charAt(i)>= 'a' && s.charAt(i)<= 'z' || s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') {
	            	containsAlphabet = true;
	                count++;
	            }else{
	            	if(containsAlphabet)
	               return count;
	            }
	        }
	        
	        return count;
		    }
		}

