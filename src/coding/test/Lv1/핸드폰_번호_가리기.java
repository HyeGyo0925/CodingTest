package coding.test.Lv1;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        for(int a=0; a<len-4; a++){
            answer+="*";
        }
        answer += phone_number.substring(len-4);

        return answer;
    }

    public static void main(String[] args) {
        핸드폰_번호_가리기 aa = new 핸드폰_번호_가리기();
        System.out.println(aa.solution("01033334444"));
        System.out.println(aa.solution("027778888"));
    }
}
