package coding.test.Lv1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기2 {

    public String solution(String s){
        String answer = "";
        String[] arr = s.split("");
        char[] c = s.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(c);

        for(int i=s.length()-1; i>=0; i--){
            answer += c[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열_내림차순으로_배치하기2 aa = new 문자열_내림차순으로_배치하기2();
        System.out.println(aa.solution("Zbcdefg"));
    }
}
