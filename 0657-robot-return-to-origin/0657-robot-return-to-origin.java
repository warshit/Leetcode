class Solution {
    public boolean judgeCircle(String s) {
        
        
        
        int[] freq = new int[26];
        for(char move: s.toCharArray()){
            freq[move-'A']++;
        }
        return (freq['L' - 'A'] == freq['R' - 'A'] && freq['U' - 'A'] == freq['D' - 'A']);
    }
    
        
    
}