class Solution {
    public int minPartitions(String n) {
        char [] arr = n.toCharArray();
        Arrays.sort(arr);
        return arr[arr.length - 1] - '0';
    }
}