package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public int Add(String numbers) throws Exception{
        String separator = ",";

        if (numbers.startsWith("//")){
            separator = numbers.substring(2,3);
            numbers = numbers.replaceAll( String.format("//%s\n",separator),"");
        }

        numbers = numbers.replaceAll("\n",separator);
        String[] numbersSplit = numbers.split(separator);
        int sum = 0;
        List<Integer> numbersNotAllowed = new ArrayList<Integer>();
        for (String s : numbersSplit) {
            int number = s.equals("") ? 0 : Integer.parseInt(s);
            if (number < 0){
                numbersNotAllowed.add(number);
            } else{
                sum += number;
            }
        }
        if (numbersNotAllowed.size() > 0)
            throw new Exception("Negatives not allowed: " + Arrays.toString(numbersNotAllowed.toArray()));
        return sum;
    }
}
