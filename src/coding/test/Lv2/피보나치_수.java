package coding.test.Lv2;

public class 피보나치_수 {
    public int solution1(int n) {
        if(n<=1){
            return n;
        }else {
            return solution1(n-1) + solution1(n-2);
        }
    }

    public int solution(int n){
        int answer = 0;

        int[] test = new int[n + 1];

        for(int i=0; i<test.length; i++){
            if(i==0){
                test[i] = 0;
            } else if (i==1){
                test[i] = 1;
            }else {
                test[i] =( (test[i-1] % 1234567) + (test[i-2] % 1234567) ) % 1234567;
            }
        }

        return answer = test[n] % 1234567;
    }

    public static void main(String[] args) {
        피보나치_수 aa = new 피보나치_수();
        System.out.println(aa.solution(5));
        System.out.println(aa.solution(3));
    }
}
