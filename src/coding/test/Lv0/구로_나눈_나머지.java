package coding.test.Lv0;
// 9로 나눈 나머지

import java.util.Arrays;

public class 구로_나눈_나머지 {
    public int solution(String number) {
        int answer = 0;
        int sum=0;
        for( int i=0; i<number.length(); i++){
            sum +=Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return answer=sum%9;
    }

    public static void main(String[] args) {
        구로_나눈_나머지 aa = new 구로_나눈_나머지();
        System.out.println(aa.solution("123"));
        System.out.println(aa.solution("78720646226947352489"));
    }
}
