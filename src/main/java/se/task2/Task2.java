package se.task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    private static final Map<String, String> users = new HashMap<>();

    //3.6
    private static void addUser(String login, String password){
        if(!users.containsKey(login)){
            users.put(login, password);
        }else{
            System.out.println("Login is busy!");
        }
    }

    private static void showUsers() {
        for (Map.Entry<String, String> user : users.entrySet()) {
            if(user.getValue().split("").length > 6){
                System.out.println("Login: " + user.getKey() + ", Password: " + user.getValue());
            }
        }
    }

    private static void test1(){
        addUser("admin", "123456");
        addUser("admin", "16");
        addUser("road", "123456789");
        addUser("to", "1234567");
        addUser("the", "46573628");
        addUser("dream", "123123123213");
        showUsers();
    }

    public static void main(String[] args) {
        test1();
    }
}
