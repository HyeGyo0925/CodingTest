package coding.test.Lv2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length-1;

        for(int i=0; i<A.length; i++){
            answer+=A[i] * B[j];
            --j;
        }
        return answer;
    }

    public static void main(String[] args) {
        최솟값_만들기 aa = new 최솟값_만들기();
        System.out.println(aa.solution(new int[]{1,4,2}, new int[]{5,4,4}));
        System.out.println(aa.solution(new int[]{1, 2}, new int[]{3, 4}));
    }
}
