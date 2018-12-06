package model;

public class StringCalculator {
    public int Add(String numbers){
        numbers = numbers.replaceAll("\n",",");
        String[] numbersSplit = numbers.split(",");
        int sum = 0;
        for (String s : numbersSplit) {
            sum += s.equals("") ? 0 : Integer.parseInt(s);
        }
        return sum;
    }

}
