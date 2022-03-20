package com.company.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TaskTwo {

    public static Map<String, String> map = new HashMap<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String login;
    public static String password;


    public static void main(String[] args) throws IOException {

        System.out.println("Hello! Choose from the menu what you want to do! ");
        showMenu();
        String check = "[1-6]";
        String read = null;

        try {
            read = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int readConvertToInt = 0;
        if (read.matches(check)) {

            readConvertToInt = Integer.parseInt(br.readLine());

        } else {
            throw new IOException(" Invalid input!");

        }

        boolean flag = true;
        while (flag) {

            switch (readConvertToInt) {
                case 1:
                    System.out.println("Enter the login a new user!");
                    try {
                        login = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Enter the password a new user!");

                    try {
                        password = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    addNewUser(login, password);
                    break;
                case 2:
                    System.out.println("Enter login of the user to delete!");
                    try {
                        login = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    deleteUser(login);
                    break;
                case 3:
                    System.out.println("Enter the login of user to check or exist!");
                    String loginCheck = null;
                    try {
                        loginCheck = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (checkExistUser(loginCheck)) {
                        System.out.println("Exist!");
                    } else {
                        System.out.println("Not exist!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the login of user to change the login!");
                    try {
                        login = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Enter the new login of user !");
                    String newLogin = null;
                    try {
                        newLogin = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    changeLoginUser(login, newLogin);
                    break;
                case 5:
                    System.out.println("Enter the  login of user to change password !");
                    try {
                        login = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Enter the new password of user !");
                    String passwordNew = null;
                    try {
                        passwordNew = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    changePasswordUser(login, passwordNew);
                    break;
                case 6:
                    System.out.println("Good buy!");
                    try {
                        br.close();
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
            if (readConvertToInt != 6) {
                showMenu();
                try {
                    readConvertToInt = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                flag = false;
            }


        }


    }


    /**
     * Задание 2
     * Необходимо разработать приложение, которое позволит сохранять информацию о логинах
     * пользователей и их паролях. Каждому пользователю соответствует
     * пара логин — пароль. При старте приложение отображается меню:
     * Практические задания
     * 1. Добавить нового пользователя;
     * 2. Удалить существующего пользователя;
     * 3. Проверить существует ли пользователь;
     * 4. Изменить логин существующего пользователя;
     * 5. Изменить пароль существующего пользователя;
     * В зависимости от выбора пользователя выполняется
     * действие, после чего меню отображается снова.
     * Для решения задачи используйте подходящий класс
     * из Java Collections Framework.
     */

    public static void addNewUser(String login, String password) {
        map.putIfAbsent(login, password);
        showMapCollection(map);
    }

    public static void deleteUser(String login) {
        map.remove(login, password);
        showMapCollection(map);
    }

    public static boolean checkExistUser(String login) {
        boolean isExist = map.containsKey(login);
        showMapCollection(map);
        return isExist;
    }

    public static void changeLoginUser(String login, String newLogin) {
        String password = map.get(login);
        map.remove(login);
        map.put(newLogin, password);
        showMapCollection(map);
    }

    public static void changePasswordUser(String login, String newPassword) {
        if (map.containsKey(login)) {
            map.replace(login, newPassword);
        }
        showMapCollection(map);
    }

    public static void showMapCollection(Map<String, String> map) {
        for (Map.Entry<String, String> item :
                map.entrySet())
            ;
        System.out.println(map.toString());
    }


    public static void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu: \n");
        sb.append("1 - add new user \n");
        sb.append("2 - delete exist user \n");
        sb.append("3 - check exist user \n");
        sb.append("4 - change login exist user \n");
        sb.append("5 - change password exist user \n");
        sb.append("6 - exit !\n");
        System.out.println(sb);
    }
}
