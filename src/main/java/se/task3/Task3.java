package se.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    //3.8
    private static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher =  pattern.matcher(email);
        return matcher.find();
    }


    public static void main(String[] args) {
        boolean result = checkEmail("alexandrkibkalo@gmail.com");
        if(result){
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }
    }
}
