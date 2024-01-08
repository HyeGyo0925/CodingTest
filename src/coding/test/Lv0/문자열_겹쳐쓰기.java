package coding.test.Lv0;
//문자열 겹쳐쓰기

public class 문자열_겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+overwrite_string.length());

        return answer;
    }

}
