class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String c = Integer.toString(a);
		String d = Integer.toString(b);
		
		int x =  Integer.parseInt(c+d);
		int y =  Integer.parseInt(d+c);
		
        if(x <y){
            answer = y;}
        else if (x>y){
            answer = x;}
        else{
            answer = x;
        }
        
        
        
        return answer;
    }
}