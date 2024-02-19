package coding.test.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            list.add(score[i]);

            if(list.size()>k){
                list.remove(Collections.min(list));
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }

    public static void main(String[] args) {
        명예의_전당_1 aa = new 명예의_전당_1();
        System.out.println(aa.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
    }
}
