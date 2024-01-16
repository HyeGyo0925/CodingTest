package coding.test.Lv0;

public class 접미사인지_확인하기 {
    public int solution(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        접미사인지_확인하기 aa = new 접미사인지_확인하기();
        System.out.println(aa.solution("banana", "ana"));
    }
}
