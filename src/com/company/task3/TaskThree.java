package com.company.task3;

import java.util.*;

public class TaskThree {
    public static Queue<Statistic> statistic = new LinkedList<>();
    public static SortedSet<Client> server = new TreeSet<Client>();


    public static void main(String[] args) {

        TaskThree t=new TaskThree();

        Client client1 = new Client("Artur", "Zimin", "Minsk");
        Client client2 = new Client("Vasiliy", "Ivanov", "Grodno");
        Client client3 = new Client("Dima", "Kolos", "Vitebsk");
        Client client4 = new Client("Katia", "Pavlova", "Baranovici");
        Client client5 = new Client("Kiril", "Boyko", "Mogilev");

        server.add(client1);
        statistic.add(new Statistic(new Date(), client1));
        server.add(client2);
        statistic.add(new Statistic(new Date(), client2));
        server.add(client3);
        statistic.add(new Statistic(new Date(), client3));
        server.add(client4);
        statistic.add(new Statistic(new Date(), client4));
        server.add(client5);
        statistic.add(new Statistic(new Date(), client5));
        t.showStatistic();
        t.showClients();

    }

    public void showStatistic(){
        statistic.forEach(x-> System.out.println(x));
    }
    public void showClients(){
        server.forEach(x-> System.out.println(x));
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
