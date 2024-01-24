package coding.test.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];

        if(cnt == 0){
            return answer = new int[]{-1};
        }

        int num=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[num++] = arr[i];
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        나누어_떨어지는_숫자_배열 aa = new 나누어_떨어지는_숫자_배열();
        System.out.println(aa.solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(aa.solution(new int[]{3, 2, 6}, 10));
    }
}
