package coding.test.Lv1;

public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        String[] reStr = {"ayaaya", "yeye", "woowoo", "mama"};

        for(int i=0; i< babbling.length; i++){
            for(int j=0; j<str.length; j++){
                babbling[i] = babbling[i].replaceAll(reStr[j], "1").replaceAll(str[j], " ");
            }
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        옹알이2 aa = new 옹알이2();
        System.out.println(aa.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(aa.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
