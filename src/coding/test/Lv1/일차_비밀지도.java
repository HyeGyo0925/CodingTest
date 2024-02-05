package coding.test.Lv1;

import java.util.ArrayList;
import java.util.List;

public class 일차_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<String> listArr1 = new ArrayList<>();
        List<String> listArr2 = new ArrayList<>();

        for(int i = 0; i< arr1.length; i++){
            String str1 = "";
            int num = arr1[i];

            if(num == 1){
                str1 = "00001";
            }else {
                while(num>0){
                    str1=num%2+str1;
                    num/=2;
                }
                if(str1.length() != n){
                    for(int a=str1.length(); a<n; a++) {
                        str1 = "0" + str1;
                    }
                }
            }
            listArr1.add(str1);
        }

        for(int i = 0; i< arr2.length; i++){
            String str2 = "";
            int num = arr2[i];

            if(num == 1){
                str2 = "00001";
            }else {
                while(num>0){
                    str2=num%2+str2;
                    num/=2;
                }
                if(str2.length() != n){
                    for(int a=str2.length(); a<n; a++){
                        str2 = "0"+str2;
                    }
                }
            }
            listArr2.add(str2);
        }

        List<String> sumList = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = "";
            for(int j=0; j<n; j++){

                String a1 = listArr1.get(i);
                String a2 = listArr2.get(i);

                int a11 = Integer.parseInt(String.valueOf(a1.charAt(j)));
                int a22 = Integer.parseInt(String.valueOf(a2.charAt(j)));

                if(a11==0 && a22==0){
                    str+="0";
                } else if (a11==0 && a22 ==1) {
                    str+="1";
                } else if (a11==1 && a22 ==0) {
                    str+="1";
                } else if (a11==1 && a22==1) {
                    str += "1";
                }
            }
            sumList.add(str);
        }

        for(int i=0; i<n; i++){
            String str = sumList.get(i);
            String ans = "";
            for(int j=0; j<n; j++){
                String one = String.valueOf(str.charAt(j));
                if(one.equals("1")){
                    ans += "#";
                }else {
                    ans += " ";
                }
            }
            answer[i] = ans;
        }
        return answer;
    }

    public static void main(String[] args) {
        일차_비밀지도 aa = new 일차_비밀지도();
        //System.out.println(aa.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
        System.out.println(aa.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}));
    }
}
