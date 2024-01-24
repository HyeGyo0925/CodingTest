package coding.test.Lv1;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }

        return answer-sum;
    }

    public static void main(String[] args) {
         없는_숫자_더하기 aa = new 없는_숫자_더하기();
        System.out.println(aa.solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(aa.solution(new int[]{5,8,4,0,6,7,9}));
    }
}
