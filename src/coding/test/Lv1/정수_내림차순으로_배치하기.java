package coding.test.Lv1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        String answer = "";
        String s = Long.toString(n);
        int[] test = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            test[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        for(int i=0; i<s.length()-1; i++){
            for(int j=0; j<s.length()-1; j++){
                if(test[j] < test[j+1]){
                    int tmp = test[j+1];
                    test[j+1] = test[j];
                    test[j] = tmp;
                }
            }
        }

        for(int i=0; i<s.length(); i++){
            answer += test[i];
        }
        return Long.parseLong(String.valueOf(answer));
    }

    public static void main(String[] args) {
        정수_내림차순으로_배치하기 aa = new 정수_내림차순으로_배치하기();
        System.out.println(aa.solution(118372));
    }
}
