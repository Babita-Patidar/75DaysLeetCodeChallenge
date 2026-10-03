class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            N = -N;
        }

        double result = 1.0;

        while (N > 0) {

            if ((N & 1) == 1) {
                result = result * x;
                N = N - 1;
            } else {
                x = x * x;
                N = N / 2;
            }
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        return result;
    }
}