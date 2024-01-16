package coding.test.Lv0;

public class 접미사인지_확인하기 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] test = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            test[i] = my_string.substring(i);
        }

        for(int i=0; i<my_string.length(); i++){
            if(test[i].equals(is_suffix)){
                answer = 1;
                break;
            }else answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        접미사인지_확인하기 aa = new 접미사인지_확인하기();
        System.out.println(aa.solution("banana", "ana"));
    }
}
