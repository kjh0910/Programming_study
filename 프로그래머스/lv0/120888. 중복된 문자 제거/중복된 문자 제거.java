import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String result = "";
        
        Set<Character> set = new LinkedHashSet<Character>();

		for(int i=0; i<my_string.length(); i++) {

			set.add(my_string.charAt(i));

		}
        
        result = (set.toString()).replace(", ", "").substring(1, set.size()+1);
        
        return result;
        
    }
}