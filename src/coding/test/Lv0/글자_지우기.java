package coding.test.Lv0;
// 글자 지우기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 글자_지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");
        for(int i=0; i<indices.length; i++){
            tmp[indices[i]] = "";
        }
        for(String x:tmp){
            answer+=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        글자_지우기 aa = new 글자_지우기();
        System.out.println(aa.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
