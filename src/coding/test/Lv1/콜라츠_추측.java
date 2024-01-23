package coding.test.Lv1;

public class 콜라츠_추측 {
    public int solution(int num) {
        int answer = 0;
        Long n = Long.parseLong(String.valueOf(num));

        while(n != 1){
            if (n % 2 == 0){
                n/=2;
                answer++;
            }else {
                n = (n * 3)+ 1;
                answer++;
            }
             if (answer >= 500) {
                answer = -1;
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠_추측 aa = new 콜라츠_추측();
        System.out.println(aa.solution(6));
        System.out.println(aa.solution(16));
        System.out.println(aa.solution(626331));
    }
}
