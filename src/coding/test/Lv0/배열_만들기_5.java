package coding.test.Lv0;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_5 {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<intStrs.length; i++){
            int aa = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(aa>k){
                answer.add(aa);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        배열_만들기_5 aa = new 배열_만들기_5();
        System.out.println(aa.solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5));
    }
}
