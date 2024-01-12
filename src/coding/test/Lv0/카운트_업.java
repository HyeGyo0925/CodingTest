package coding.test.Lv0;
// 카운트 업

import java.util.ArrayList;
import java.util.List;

public class 카운트_업 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-(start_num-1)];
        for(int i=0; i<= end_num-start_num; i++){
            answer[i] = start_num+i;
        }
        return answer;
    }

    public static void main(String[] args) {
        카운트_업 aa = new 카운트_업();
        System.out.println(aa.solution(3, 10));
    }
}
