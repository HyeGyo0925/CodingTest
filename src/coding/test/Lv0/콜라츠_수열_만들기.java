package coding.test.Lv0;
// 콜라츠 수열 만들기

import java.util.ArrayList;
import java.util.List;

public class 콜라츠_수열_만들기 {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);

        while(n != 1){
            if(n % 2 == 0){
                n/=2;
                answer.add(n);
            }else {
                n = 3 * n +1;
                answer.add(n);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠_수열_만들기 aa = new 콜라츠_수열_만들기();
        System.out.println(aa.solution(10));
    }
}
