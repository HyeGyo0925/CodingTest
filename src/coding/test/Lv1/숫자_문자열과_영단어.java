package coding.test.Lv1;

public class 숫자_문자열과_영단어 {
    public int solution(String s) {
        String answer = "";
        String[] word = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = new String[]{"0","1","2","3","4","5","6","7","8","9"};

        for(int i=0; i<s.length(); i++){

            for(int p=0; p<s.length()-i+1; p++) {
                String ww = s.substring(i, i + p);
                for (int a = 0; a < word.length; a++) {
                    if (word[a].equals(ww)) {
                        answer += number[a];
                        break;
                    } else if (number[a].equals(ww)) {
                        answer += ww;
                        break;
                    }
                }
            }


        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        숫자_문자열과_영단어 aa= new 숫자_문자열과_영단어();
        System.out.println(aa.solution("23four5six7"));
        System.out.println(aa.solution("one4seveneight"));
        System.out.println(aa.solution("2three45sixseven"));
        System.out.println(aa.solution("1234"));
    }
}
