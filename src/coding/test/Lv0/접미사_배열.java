package coding.test.Lv0;
// 접미사 배열

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 접미사_배열 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for(int i=0; i<my_string.length(); i++){
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        접미사_배열 aa = new 접미사_배열();
        System.out.println(aa.solution("banana"));
    }
}
