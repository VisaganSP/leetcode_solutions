public class MergeOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] mergedArr = new int[n1 + n2];

        mergedArr = mergeTwoArrays(nums1, nums2, n1, n2);
        for (int i = 0; i < mergedArr.length; i++)
            System.out.println(mergedArr[i]);

        int mergedArrLen = mergedArr.length;

        if (mergedArrLen % 2 != 0) {
            // Odd length: median is the middle element
            return mergedArr[mergedArrLen / 2];
        } else {
            // Even length: median is the average of the two middle elements
            double mid1 = mergedArr[mergedArrLen / 2 - 1];
            double mid2 = mergedArr[mergedArrLen / 2];
            return (mid1 + mid2) / 2.0;
        }
    }

    public static int[] mergeTwoArrays(int[] nums1, int[] nums2, int n1, int n2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[n1 + n2];

        for (int s = 0; s < n1 + n2; s++)
            merged[s] = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        while (i < n1)
            merged[k++] = nums1[i++];

        while (j < n2)
            merged[k++] = nums2[j++];

        return merged;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 3 }, num2 = { 2 };
        int[] num3 = { 1, 2 }, num4 = { 3, 4 };
        int[] num5 = { 10, 5, 15 }, num6 = { 20, 3, 2 };

        System.out.println(findMedianSortedArrays(num1, num2));
        System.out.println(findMedianSortedArrays(num3, num4));
        System.out.println(findMedianSortedArrays(num5, num6));
    }
}
