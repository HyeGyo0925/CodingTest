package coding.test.Lv1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5]) score[0]++;
            if(answers[i] == two[i%8]) score[1]++;
            if(answers[i] == three[i%10]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        for(int i=1; i<=3; i++){
            if(max == score[i-1]){
                answer.add(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        모의고사 aa = new 모의고사();
        System.out.println(aa.solution(new int[]{1,2,3,4,5}));
        System.out.println(aa.solution(new int[]{1,3,2,4,2}));
    }
}
