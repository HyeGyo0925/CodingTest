package coding.test.Lv0;
// 간단한 논리 연산

public class 간단한_논리_연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;


        return answer = (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        간단한_논리_연산 aa = new 간단한_논리_연산();
        System.out.println(aa.solution(false, true, true, true));
    }
}
