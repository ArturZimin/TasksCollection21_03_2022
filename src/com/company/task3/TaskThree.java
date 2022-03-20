package com.company.task3;

import java.util.LinkedList;
import java.util.Queue;

public class TaskThree {
    public static Queue statistic = new LinkedList();
    public static Queue<Integer> server = new LinkedList<>();


    public static void main(String[] args) {


        Thread clientOne = new Thread(new Client());
        Thread clientTwo = new Thread(new Client());
        Thread clientThree = new Thread(new Client());
        Thread clientFour = new Thread(new Client());
        clientOne.setPriority(7);
        clientTwo.setPriority(9);
        clientThree.setPriority(8);
        clientFour.setPriority(7);
        clientOne.start();
        clientTwo.start();
        clientThree.start();
        clientFour.start();


    }


    /**
     * Задание 3
     * Разработать приложение, имитирующее очередь запросов к серверу.
     * Должны быть клиенты, посылающие
     * запросы на сервер, у каждого из которых есть свой приоритет.
     * Каждый новый клиент попадает в очередь в зависимости от своего приоритета.
     * Необходимо сохранять
     * статистику запросов (пользователь, время) в отдельной
     * очереди.
     * Предусмотреть вывод статистики на экран.
     * Для решения задачи используйте подходящий класс
     * из Java Collections Framework.
     */
}
