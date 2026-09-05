class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
       

        while (binary.length() < 32) {
           binary = "0" + binary;
        }
        String reverse = new StringBuilder(binary).reverse().toString();
        
        int num = Integer.parseInt(reverse, 2);
        return num;

        
    }
}