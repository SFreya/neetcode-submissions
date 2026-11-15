class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // Array is not rotated, perform normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If we found a pivot, we have two subarrays to search
        if (nums[pivot] == target) {
            return pivot; // Target found at pivot
        }
        if (target >= nums[0]) {
            // Search in the left subarray
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // Search in the right subarray
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid<end && arr[mid] > arr[mid + 1]) {
                return mid; // Pivot found
            }
           if (mid>start && arr[mid]<arr[mid-1]){
               return mid-1;
           }
            if (arr[mid] >= arr[start]) {
                // Left side is sorted, pivot must be in the right side
                start = mid + 1;
            } else {
                // Right side is sorted, pivot must be in the left side
                end = mid - 1;
            }
    }
        return -1; // No pivot found, array is not rotated
    }
}
