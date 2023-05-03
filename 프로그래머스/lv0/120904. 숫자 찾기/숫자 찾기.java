class Solution {
    public int solution(int num, int k) {
        int index = String.valueOf(num).indexOf(String.valueOf(k))+1;
		int answer = (index == 0) ? -1 : index; 
        
        return answer;
    }
}