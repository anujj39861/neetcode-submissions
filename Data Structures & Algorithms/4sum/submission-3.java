class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (arr == null || arr.length < 4) {
            return result;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            // Skip duplicate first values
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {
                // Skip duplicate second values
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    long sum = (long) arr[i]
                            + arr[j]
                            + arr[left]
                            + arr[right];

                    if (sum == target) {
                        result.add(Arrays.asList(
                                arr[i], arr[j], arr[left], arr[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate third values
                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        // Skip duplicate fourth values
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}