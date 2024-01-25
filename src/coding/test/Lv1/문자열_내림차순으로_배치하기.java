package coding.test.Lv1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str){
            answer+=a;
        }
        return answer;
    }

    public String solution1(String s){
        String result = "";
        String[] arr = s.split("");
        Arrays.sort(arr);

        for(int i=s.length()-1; i>=0; i--){
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 aa = new 문자열_내림차순으로_배치하기();
        System.out.println(aa.solution("Zbcdefg"));
        System.out.println(aa.solution1("Zbcdefg"));
    }
}
