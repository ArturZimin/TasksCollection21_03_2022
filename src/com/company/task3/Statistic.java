package com.company.task3;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Statistic {
   private Date date ;
  private Client client;

    public Statistic(Date date, Client client) {
        this.date = date;
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistic statistic = (Statistic) o;
        return Objects.equals(date, statistic.date) && Objects.equals(client, statistic.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, client);
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "date=" + date +
                ", client=" + client +
                '}';
    }
}
