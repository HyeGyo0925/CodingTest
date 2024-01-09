package coding.test.Lv0;
// 두 수의 연산값 비교하기

public class 두_수의_연산값_비교하기 {
    public int solution(int a, int b) {
        int answer = 0;
        int one = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int two = 2 * a * b;

        if(one > two){
            answer = one;
        }else{
            answer = two;
        }

        return answer;
    }

    public static void main(String[] args) {
        두_수의_연산값_비교하기 aa = new 두_수의_연산값_비교하기();
        System.out.println(aa.solution(2, 91));
    }
}
