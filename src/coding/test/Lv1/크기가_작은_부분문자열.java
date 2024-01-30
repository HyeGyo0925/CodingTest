package coding.test.Lv1;

public class 크기가_작은_부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        int i = 0;
        int pp = Integer.parseInt(p);

        while (i != t.length() - len + 1){
            int num = Integer.parseInt(t.substring(i, i + len));
            if(num <= pp){
                answer++;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        크기가_작은_부분문자열 aa = new 크기가_작은_부분문자열();
        System.out.println(aa.solution("3141592","271" ));
        System.out.println(aa.solution("500220839878","7" ));
        System.out.println(aa.solution("10203","15" ));
    }
}
