class Solution {
    public int solution(int[] sides) {
        		int max = sides[0];
		int add = 0;
		int result;
		
		for(int i=1; i<sides.length; i++) {
			if(max < sides[i]) {
				max = sides[i];
			}
		}
		
		for(int i=0; i<sides.length; i++) {
				add += sides[i];
		}
		
		add -= max;
		
		
		result = (max < add) ? 1 : 2; 
		return result;
    }
}