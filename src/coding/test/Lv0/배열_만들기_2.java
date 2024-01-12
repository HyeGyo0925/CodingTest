package coding.test.Lv0;
// 배열 만들기 2

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_2 {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for(int i=l; i<= r; i++){
            if(String.valueOf(i).contains("1") || String.valueOf(i).contains("2") || String.valueOf(i).contains("3") ||
                    String.valueOf(i).contains("4") || String.valueOf(i).contains("6") || String.valueOf(i).contains("7") ||
                    String.valueOf(i).contains("8") || String.valueOf(i).contains("9")){
                continue;
            }else {
                answer.add(i);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        배열_만들기_2 aa = new 배열_만들기_2();
        System.out.println(aa.solution(5, 555));
        System.out.println(aa.solution(10, 20));
    }
}
