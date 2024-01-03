/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String answer = "";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(unique.indexOf(ch) == -1){
                unique = unique + ch;
                answer = answer + ch;
            }

            else{
                if(ch == ' '){
                    answer = answer + ch;
                }
            }

        }
        return answer;
    }
}
