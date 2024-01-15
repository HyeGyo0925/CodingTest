package coding.test.Lv0;
// 글자 이어 붙여 문자열 만들기

import java.util.ArrayList;
import java.util.List;

public class 글자_이어_붙여_문자열_만들기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        List<String> test = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            test.add(String.valueOf(my_string.charAt(i)));
        }

        for(int i=0; i<index_list.length; i++){
            answer += (my_string.charAt(index_list[i]));
        }
        return answer;
    }

    public static void main(String[] args) {
        글자_이어_붙여_문자열_만들기 aa = new 글자_이어_붙여_문자열_만들기();
        System.out.println(aa.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
    }
}
