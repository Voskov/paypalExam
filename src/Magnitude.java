import java.util.Arrays;

public class Magnitude {
    public static int solution(int[] A){
        int max = A[0];
        int min = A[A.length - 1];
        for (int i = 1; i < A.length; i++){
            if (A[i] > max){
                max = A[i];
            }
            if (A[i] < min){
                min = A[i];
            }
            if (A[i] >= max && A[i] < min){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {4,2,2,3,1,4,7,8,6,9};
        System.out.println(solution(test));
    }
}
