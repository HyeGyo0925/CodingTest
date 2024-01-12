package coding.test.Lv0;
// 카운트 업

import java.util.ArrayList;
import java.util.List;

public class 카운트_업 {
    public List<Integer> solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for(int i=start_num; i<=end_num; i++){
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        카운트_업 aa = new 카운트_업();
        System.out.println(aa.solution(3, 10));
    }
}
