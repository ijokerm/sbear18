import java.util.Arrays;

class Solution {
    public int LargestPerimeter(int[] A) {
        if (A.length < 2) {
            System.out.println("error");
        }
            Arrays.sort(A);
            for (int i = A.length - 3; i >= 0; i--) {
                if (A[i] + A[i + 1] > A[i + 2]) {
                    int result = A[i + 1] + A[i] + A[i + 2];
                    return result;
                }

            }
            return 0;
        }

    }

public class largestPerimeter {
        public static void main(String[] args) {
         int[] A={2,4,5,4};
         Solution s=new Solution();
        int result= s.LargestPerimeter(A);
            System.out.println(result);

        }
}
