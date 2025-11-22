class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int number : nums) {
            int remainder = number % 3;
            if (remainder == 1 || remainder == 2) {
                operations++;
            }
        }
        return operations;
        
    }
}
