import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<Integer>();
		for(int i=2; i<=n; i++) {
			while(n % i == 0){
				if(n % i == 0) {
					set.add(i);
					n /= i;
				}
			}
		}
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}