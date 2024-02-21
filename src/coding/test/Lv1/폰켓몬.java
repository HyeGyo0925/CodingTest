package coding.test.Lv1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length/2;
        HashSet<Integer> hash = new HashSet();

        for(int i : nums){
            hash.add(i);
        }

        if(len >= hash.size()){
            answer = hash.size();
        }else {
            answer = len;
        }

        return answer;
    }

    public static void main(String[] args) {
        폰켓몬 aa = new 폰켓몬();
        System.out.println(aa.solution(new int[]{3,1,2,3}));
        System.out.println(aa.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(aa.solution(new int[]{3,3,3,2,2,2}));
    }
}
