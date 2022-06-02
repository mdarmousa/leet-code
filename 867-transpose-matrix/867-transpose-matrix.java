class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        if (r!=c){
            int[][] T= new int[c][r];
            for (int i = 0; i < r ; i++) {
                for (int j = 0; j <c ; j++) {
                    T[j][i] = A[i][j];
                }
            }
            return T;
        } else {
            for (int i = 0; i < r ; i++) {
                for (int j = i; j <c ; j++) {
                    if (i!=j){
                        int temp = A[i][j];
                        A[i][j]= A[j][i];
                        A[j][i] = temp;
                    }
                }

            }
            return A;
        }
    }
}