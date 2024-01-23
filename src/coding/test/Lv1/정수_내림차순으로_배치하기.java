package coding.test.Lv1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for(String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        정수_내림차순으로_배치하기 aa = new 정수_내림차순으로_배치하기();
        System.out.println(aa.solution(118372));
    }
}
