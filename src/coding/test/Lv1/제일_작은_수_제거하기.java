package coding.test.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1){
            answer = new int[]{-1};
            return answer;
        }

        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }else {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        제일_작은_수_제거하기 aa = new 제일_작은_수_제거하기();
        System.out.println(aa.solution(new int[] {4,3,2,1}));
        System.out.println(aa.solution(new int[] {10}));
    }
}
