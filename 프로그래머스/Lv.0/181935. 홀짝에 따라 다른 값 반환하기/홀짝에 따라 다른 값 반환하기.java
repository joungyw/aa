class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2!=0) 
			for(int i = 1;i<n+1; i=i+2) 
				 answer = answer+i;
			
		
		else 
			for(int j = 0; j < n+1; j=j+2) 
				answer = answer+(j*j);
			
		
        return answer;
    }
}