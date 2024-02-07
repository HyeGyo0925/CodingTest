package coding.test.Lv2;

public class 올바른_괄호 {
    boolean solution(String s) {
        int cnt1 = 0, cnt2 = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                cnt1++;
            } else if (s.charAt(i) == ')') {
                cnt2++;
            }
            if(cnt1 < cnt2){
                return false;
            }
        }

        if(cnt1 == cnt2){
            return true;
        }
         return false;
    }

    public static void main(String[] args) {
        올바른_괄호 aa = new 올바른_괄호();
        System.out.println(aa.solution("()()"));
        System.out.println(aa.solution("(())()"));
        System.out.println(aa.solution(")()("));
        System.out.println(aa.solution("(()("));
    }
}
