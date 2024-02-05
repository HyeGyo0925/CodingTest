package coding.test.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for(int i=0; i<strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(int i=0; i<strings.length; i++){
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        문자열_내_마음대로_정렬하기 aa = new 문자열_내_마음대로_정렬하기();
        System.out.println(aa.solution(new String[]{"sun", "bed", "car"}, 1));
    }
}
