package String;

public class SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c :s.toCharArray()){
            sb.append(letterToPosition(c));
        }

        String str = sb.toString();

        while(k > 0){
            str = sum(str);
            k--;
        }
        return Integer.parseInt(str);
    }

    private int letterToPosition(char ch){
        return ch - 'a' + 1;
    }

    private String sum(String s){
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += c - '0';

        }

        return Integer.toString(sum);
    }
}
