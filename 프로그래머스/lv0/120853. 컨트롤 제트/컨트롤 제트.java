import java.util.Arrays;

class Solution {
    public int solution(String s) {
        boolean isSpace = false;
		
		String[] arr = s.trim().split(" ");
		int[] intArr = new int[arr.length];
		int subtraction = 0;
		int answer = 0;
        
        for(int i=0; i<arr.length; i++) {
			if(!(arr[i].equals("Z"))) {
				intArr[i] = Integer.parseInt(arr[i]);
				subtraction = 0;
				
			}
			
		}
		

		answer = Arrays.stream(intArr)
				.boxed()
				.limit(intArr.length)
				.reduce((x, y) -> x + y)
				.get();
		
			
		
		do {
			for(int i=1; i<arr.length; i++) { 
				if(arr[i].equals("Z")) {
					subtraction = Integer.parseInt(arr[i-1]);
					isSpace = true;
					answer -= subtraction;
				}
			}
			
			isSpace = false;
					
		} while(isSpace);
        
        
        return answer;
    }
}