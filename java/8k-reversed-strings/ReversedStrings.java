public class ReversedStrings {

    public static String solution(String str) {

        String solution = "dlrow";
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return (reverse.toString());
    }
}
