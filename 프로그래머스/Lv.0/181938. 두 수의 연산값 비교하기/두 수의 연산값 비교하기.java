class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = Integer.toString(a);
		String d = Integer.toString(b);
		
		int x =  Integer.parseInt(c+d);
		int y =  2*a*b;
		
        if(x <y){
            answer = y;}
        else{
            answer = x;}
        
        
        
        
        return answer;
    }
}