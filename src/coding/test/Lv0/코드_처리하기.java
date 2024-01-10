package coding.test.Lv0;
// 코드_처리하기

public class 코드_처리하기 {
    public String solution(String code){
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for(int i=0; i<code.length(); i++){
            char current = code.charAt(i);
            if(current == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if(i % 2 == mode){
                answer.append(current);
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }

    public static void main(String[] args) {
        코드_처리하기 aa = new 코드_처리하기();
        System.out.println(aa.solution("abc1abc1abc"));
    }
}
