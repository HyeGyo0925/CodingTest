package coding.test.Lv0;
//공배수

public class 공배수 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n ==0 && number % m == 0){
            answer=1;
        }else answer=0;
        return answer;
    }
}
