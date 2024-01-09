package coding.test.Lv0;
//flag에_따라_다른_값_반환하기

import java.util.Objects;

public class flag에_따라_다른_값_반환하기 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a+b;
        }else answer = a - b;
        return answer;
    }

    public static void main(String[] args) {
        flag에_따라_다른_값_반환하기 aa = new flag에_따라_다른_값_반환하기();
        System.out.println(aa.solution(-4, 7, true));
        System.out.println(aa.solution(-4, 7, false));
    }
}
