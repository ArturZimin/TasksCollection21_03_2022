package com.company.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskOne {
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        System.out.println("Enter a set of numbers separated by a space! Example : 12 2 33 44 .");

        String str = br.readLine();
        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            String temp = str1[i];
            arrayList.add((Integer.parseInt(temp)));
        }
        showMenu();

        int choose = readLineWithBufferedReader();
        switch (choose) {

            case 1:
                System.out.println("Enter the number to add in the Collection!");
                choose = readLineWithBufferedReader();
                addElementInTheCollection(arrayList, choose);
                showElementsInTheList(arrayList);
                break;
            case 2:
                System.out.println("Enter the element to  delete from the Collection!");
                choose = readLineWithBufferedReader();
                deleteElementFromTheCollection(arrayList, choose);
                showElementsInTheList(arrayList);
                break;
            case 3:
                showElementsInTheList(arrayList);
                break;
            case 4:
                System.out.println("Enter the number for check in the Collection!");
                int read = readLineWithBufferedReader();
                boolean check = checkTheElementInTheCollection(arrayList, read);
                if (check == true) {
                    System.out.println("The element has already located in the Collection. ");
                } else {
                    System.out.println("The element does not exist in the Collection. ");
                }
                break;
            case 5:
                System.out.println("Enter the number for delete!");
                Integer readNumbForDelete = readLineWithBufferedReader();
                System.out.println("Enter the number for add!");
                Integer readNumbForAdd = readLineWithBufferedReader();
                replaceElementInTheList(arrayList, readNumbForDelete, readNumbForAdd);
                showElementsInTheList(arrayList);
                break;
            default:
                br.close();
                break;


        }


    }


    /**
     * Задание 1
     * Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список.
     * После чего нужно показать меню, в котором предложить пользователю набор пунктов:
     * 1. Добавить элемент в список;
     * 2. Удалить элемент из списка;
     * 3. Показать содержимое списка;
     * 4. Проверить есть ли значение в списке;
     * 5. Заменить значение в списке.
     * В зависимости от выбора пользователя выполняется
     * действие, после чего меню отображается снова.
     * Для решения задачи используйте подходящий класс
     * из Java Collections Framework.
     *
     * @throws IOException
     */

    public static void replaceElementInTheList(ArrayList<Integer> list, int elementForDelete, int elementForAdd) {
        Iterator iterator = arrayList.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Object readInt = iterator.next();
            if (readInt.equals(elementForDelete)) {
                list.set(count, elementForAdd);
                break;
            }
            count++;
        }
    }

    public static void showMenu() {
        System.out.println("Choose from list:");
        System.out.println("1 - Add element");
        System.out.println("2 - remove element");
        System.out.println("3 - show all the elements");
        System.out.println("4 - check is exist element in the list");
        System.out.println("5 - replace element in the list");
    }

    public static void addElementInTheCollection(ArrayList<Integer> list, int element) {
        list.add(element);
    }

    public static void showElementsInTheList(ArrayList<Integer> list) {
        list.forEach(x -> System.out.print(x + " "));
    }

    public static boolean checkTheElementInTheCollection(ArrayList<Integer> list, int number) {
        boolean isExistElement = false;
        for (Integer i : list) {
            if (i.equals(number)) {
                isExistElement = true;
            }
        }
        return isExistElement;
    }

    public static void deleteElementFromTheCollection(ArrayList<Integer> list, int number) {
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object temp = iterator.next();
            if (temp.equals(number)) {
                iterator.remove();
            }
        }
    }




    public static int readLineWithBufferedReader() {

        int readLine = 0;
        try {
            readLine = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readLine;

    }


}
