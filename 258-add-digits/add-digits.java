class Solution {
    int sum = 0;

    int getCountDigits(int num) {
        sum = 0;
        int count = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
            count++;
        }

        return count;
    }

    int addDigits(int num) {
        while (getCountDigits(num) > 1) {
            num = sum;
        }
        return sum;
    }
}