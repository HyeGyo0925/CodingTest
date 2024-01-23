package coding.test.Lv1;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a == b){
            answer = a;
        }else {
            if(a<b){
                for(int i=a; i<=b; i++){
                    answer+=i;
                }
            }else {
                for(int i=b; i<=a; i++){
                    answer+=i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        두_정수_사이의_합 aa = new 두_정수_사이의_합();
        System.out.println(aa.solution(3, 5));
        System.out.println(aa.solution(3, 3));
        System.out.println(aa.solution(5, 3));
    }
}
