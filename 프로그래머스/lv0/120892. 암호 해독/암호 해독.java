class Solution {
    public String solution(String cipher, int code) {
       String result = "";
        
       for(int i =1; i<=cipher.length(); i++) {
			char c = (cipher.charAt(i-1));
			
			if(i%code==0) {
				result += c;
				
			}
		}
        
        return result;
        
    }
}