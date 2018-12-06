package model;

public class StringCalculator {
    public int Add(String numbers){
        String[] numbersSplit = numbers.split(",");
        int count = numbersSplit.length;
        if (count > 2)
            count = 2;
        int sum = 0;
        for (int i = 0; i<count;i++){
            sum +=  numbersSplit[i].equals("") ? 0 : Integer.parseInt(numbersSplit[i]);
        }
        return sum;
    }

}
