package coding.test.Lv1;

import java.util.Calendar;

public class 윤년_2016년 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);

        int dayN = cal.get(Calendar.DAY_OF_WEEK);

        answer = day[dayN-1];
        return answer;
    }

    public static void main(String[] args) {
        윤년_2016년 aa = new 윤년_2016년();
        System.out.println(aa.solution(5,24));
        System.out.println(aa.solution(2,1));
        System.out.println(aa.solution(9,25));
    }
}
