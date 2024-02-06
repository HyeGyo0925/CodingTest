package coding.test.Lv2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        int min , max;
        min = max = Integer.parseInt(str[0]);

        for(int i=1; i<str.length; i++){
            int n = Integer.parseInt(str[i]);
            if(min > n){
                min = n;
            }
            if(max < n){
                max = n;
            }
        }
        answer = min + " " + max;

        return answer;
    }

    public static void main(String[] args) {
        최댓값과_최솟값 aa = new 최댓값과_최솟값();
        System.out.println(aa.solution("1 2 3 4"));
        System.out.println(aa.solution("-1 -2 -3 -4"));
    }
}
