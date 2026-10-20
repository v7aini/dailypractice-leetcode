package day3;

class FindPeakElement162 {
    public static void main(String[] args) {
        FindPeakElement162 obj = new FindPeakElement162();
        int[] nums = {1,2,3,1};
        System.out.println(obj.findPeakElement(nums));
}
    public int findPeakElement(int[] nums) {
        int l = 0,
            r = nums.length-1;

        while(l < r) {
            int mid = l + (r - l) / 2;

            if(nums[mid] > nums[mid+1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

}
