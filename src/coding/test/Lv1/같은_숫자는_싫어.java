package coding.test.Lv1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 같은_숫자는_싫어 {

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

    // Set, HashSet
    public Set<Integer> solution1(int []arr) {
        Set<Integer> answer = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        같은_숫자는_싫어 aa = new 같은_숫자는_싫어();
        System.out.println(aa.solution(new int[]{1,1,3,3,0,1,1}));
        System.out.println(aa.solution(new int[]{4,4,4,3,3}));
    }
}
