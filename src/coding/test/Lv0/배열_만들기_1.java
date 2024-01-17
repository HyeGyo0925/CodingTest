package coding.test.Lv0;
// 배열 만들기 1

public class 배열_만들기_1 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int a = k;
        for(int i=0; i<n/k; i++){
            answer[i] = a;
            a = a+k;
        }
        return answer;
    }

    public static void main(String[] args) {
        배열_만들기_1 aa = new 배열_만들기_1();
        System.out.println(aa.solution(10, 3));
    }
}
