package coding.test.Lv1;

import java.util.*;

public class 두_개_뽑아서_더하기 {
    public List<Integer> solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i==j){
                    break;
                }else {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            if(answer.contains(list.get(i))){
                continue;
            }else {
                answer.add(list.get(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        두_개_뽑아서_더하기 aa = new 두_개_뽑아서_더하기();
        System.out.println(aa.solution(new int[]{2,1,3,4,1}));
        System.out.println(aa.solution(new int[]{5,0,2,7}));
    }
}
