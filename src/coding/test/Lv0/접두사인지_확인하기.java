package coding.test.Lv0;
// 접두사인지 확인하기

public class 접두사인지_확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        접두사인지_확인하기 aa = new 접두사인지_확인하기();
        System.out.println(aa.solution("banana", "nan"));
    }
}
