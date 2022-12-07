class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] chars= new StringBuilder(s).reverse().toString().toCharArray();
        int count=0;
        String whiteSpace=" ";
        for (char c: chars){
            if(c!=whiteSpace.charAt(0)){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
