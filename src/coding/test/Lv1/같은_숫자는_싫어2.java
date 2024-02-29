package coding.test.Lv1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어2 {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int val = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                answer.add(arr[i]);
                val = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        같은_숫자는_싫어2 aa = new 같은_숫자는_싫어2();
        System.out.println(aa.solution(new int[]{1,1,3,3,0,1,1}));
        System.out.println(aa.solution(new int[]{4,4,4,3,3}));
    }
}
