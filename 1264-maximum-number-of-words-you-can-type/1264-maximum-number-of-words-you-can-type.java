class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] a = text.split(" ");
        int c=0;
        for(String parts:a){
            if(fun(parts,brokenLetters)){
                c++;
            }
        }
        return c;
    }
    private boolean fun(String a,String bl){
        for(int i=0;i<bl.length();i++){            
        if(a.contains(Character.toString(bl.charAt(i)))) {
            return false;
        }
        
        }
        return true;
    }
}