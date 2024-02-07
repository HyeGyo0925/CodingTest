package coding.test.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i=0;
        for(i=0; i< completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }

        return participant[i];
    }

    public String solution1(String[] participant, String[] completion){
        String answer = "";

        Map<String, Integer> hm = new HashMap<>();

        for(String p : participant){
            hm.put(p, hm.getOrDefault(p, 0)+1);
        }

        for(String c : completion){
            hm.put(c, hm.get(c)-1);
        }

        for(String key : hm.keySet()){
            if(hm.get(key) != 0){
                answer = key;
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        완주하지_못한_선수 aa = new 완주하지_못한_선수();
        System.out.println(aa.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(aa.solution1(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
    }
}
