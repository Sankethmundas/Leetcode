class Solution {
    public int countDigits(int num) {
        int n = num;
        int counter = 0;
        while (n > 0){
            int digit = n % 10 ;
            if (num % digit == 0)
                counter++;
            
            n/=10;
        }
        return counter;
    }
}