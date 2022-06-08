class Solution {
public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m-1, n2 = n-1, i = nums1.length-1;
        while(n1 >= 0 && n2 >= 0){
            if(nums1[n1] > nums2[n2]){
                nums1[i] = nums1[n1];
                n1--;
            }else{
                nums1[i] = nums2[n2];
                n2--;
            }
            i--;
        }
        while(n2 >= 0){
            nums1[i] = nums2[n2];
            n2--;
            i--;
        }
    }
}