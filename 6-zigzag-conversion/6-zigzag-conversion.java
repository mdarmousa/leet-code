class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++)
            rows[i] =new StringBuilder();

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}