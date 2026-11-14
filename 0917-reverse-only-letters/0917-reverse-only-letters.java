class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j=s.length()-1;

        while (i < j) {
            if(!Character.isLetter(sb.charAt(i))) i++;
            else if(!Character.isLetter(sb.charAt(j))) j--;
            else{
                char temp = sb.charAt(i);

                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }

            
        }
        return sb.toString();
        
    }
}