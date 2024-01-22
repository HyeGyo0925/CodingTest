package coding.test.Lv1;

public class 평균_구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer+=arr[i];
        }
        return answer=answer/arr.length;
    }

    public static void main(String[] args) {
        평균_구하기 aa = new 평균_구하기();
        System.out.println(aa.solution(new int[]{1,2,3,4}));
    }
}
