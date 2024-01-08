package coding.test.Lv0;

import java.util.Scanner;

// 대소문자 바꿔서 출력하기
public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                ans += Character.toLowerCase(c);
            }else
                ans += Character.toUpperCase(c);
        }

        System.out.println(ans);
    }
}