package coding.test.Lv0;
// 원소들의 곱과 합

public class 원소들의_곱과_합 {
    public int solution(int[] num_list) {
        int answer = 0;
        int one = 1, two = 0;
        for(int i = 0; i<num_list.length; i++){
            one *= num_list[i];
            two += num_list[i];
        }
        two = two * two;
        if(one < two){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        원소들의_곱과_합 aa = new 원소들의_곱과_합();
        System.out.println(aa.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(aa.solution(new int[]{5, 7, 8, 3}));
    }
}
