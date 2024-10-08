// class Solution 
// {
//     public void merge(int[] nums1, int m, int[] nums2, int n) 
//     {
//         for (int i = 0; i<m;i++)
//         {
//             nums1[m+i]=nums2[i];
//         }
//         Arrays.sort(nums1);
//     }
// }
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int j =0;
        for(int i=m;i < nums1.length;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}