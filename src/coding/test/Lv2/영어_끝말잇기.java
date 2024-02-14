package coding.test.Lv2;

import java.util.HashMap;
import java.util.Map;

public class 영어_끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++){
            if(i != 0){
                String one = words[i];      // 현재 단어
                String two = words[i-1];    // 이전 단어

                char one2 = one.charAt(0);  // 현재 단어의 첫 철자
                char two2 = two.charAt(two.length()-1); // 이전 단어의 끝 철자

                if(one2 != two2 || map.containsKey(one)){
                    answer[0] = (i%n) + 1;   // 번호
                    answer[1] = (i/n) + 1;    // 차례
                    break;
                }

            }
            map.put(words[i], 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        영어_끝말잇기 aa = new 영어_끝말잇기();
        System.out.println(aa.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
        System.out.println(aa.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
    }
}
