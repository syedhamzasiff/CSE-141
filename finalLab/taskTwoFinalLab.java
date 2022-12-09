import java.util.Scanner;

public class taskTwoFinalLab {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input String 1");
        String str1 = input.next();
        System.out.println("input String 2");
        String str2 = input.next();

        System.out.println(rotation(str1, str2));


    }
    public static boolean rotation(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        String ans = "";

        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            if(str1.charAt(i) == str2.charAt(count) ){
                if (str1.charAt(i+1) == str2.charAt(count+1)) {
                    while (str1.charAt(i) == str2.charAt(count) && i + 1 < str1.length()) {
                        ans += str1.charAt(i);
                        count++;
                        i++;
                    }
                }
            }
            i += count;
        }
        int index = str1.indexOf(ans);
        String sub = str1.substring(index);
        String first = str1.substring(0, index);

        String ansans = sub + first;

        if (ansans.equals(str2))
            return true;

        return false;
    }
}
