public class Search {
    public static void main(String[] args) {
        int nums[] = {1,3,5,7,9,11,13,15,17};
        int target = 7;

        int result = binarySearch(nums,target,0,nums.length-1);
        if(result != -1){
            System.out.println("Element found at :" + result);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
        if(left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
            return binarySearch(nums, target, mid + 1, right);
        else
            return binarySearch(nums, target, left, mid - 1);

    }

    private static int linearSearch(int[] nums, int target) {

        for(int i=0 ;i <= nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        //1,3,5,7,9,11,13,15,17
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]<target ) {
                left = mid+1;
            }else{
                right = mid-1;
            }


        }

        return -1;
    }
}
