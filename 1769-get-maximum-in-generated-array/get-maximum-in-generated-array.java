class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;

        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        int maxi = 1; 

        for (int i = 1; 2 * i <= n; i++) {
            if (2 * i <= n) {
                arr[2 * i] = arr[i];
                maxi = Math.max(maxi, arr[2 * i]);
            }
            if (2 * i + 1 <= n) {
                arr[2 * i + 1] = arr[i] + arr[i + 1];
                maxi = Math.max(maxi, arr[2 * i + 1]);
            }
        }

        return maxi;
    }
}
