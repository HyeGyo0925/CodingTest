package coding.test.Lv1;
// 문자열 내 p와 y의 개수

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        boolean answer = true;
        int p=0, y=0;
        for(int i=0; i<s.length(); i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals("p") || c.equals("P")){
                p++;
            } else if (c.equals("y") || c.equals("Y")) {
                y++;
            }
        }
        if(p==y){
            answer = true;
        } else if (p==0 && y==0) {
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열_내_p와_y의_개수 aa = new 문자열_내_p와_y의_개수();
        System.out.println(aa.solution("pPoooyY"));
        System.out.println(aa.solution("Pyy"));
    }
}
