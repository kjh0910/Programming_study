class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
			char ch = (my_string.charAt(i));

			if('a' <= ch && ch<= 'z') {
				answer += (char)(my_string.charAt(i)-32);
			}
			
			if('A' <= ch && ch<= 'Z') {
				answer += (char)(my_string.charAt(i)+32);
			}
            
		} 
        
        return answer;
    }
}