package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.ArrayChangeListener;
import javafx.collections.ObservableArray;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.Date;

public class Spend  {
    String name;
    String content;
    int money;
    String note;
    LocalDate date;
    boolean isIncome;

    public Spend() {
    }

    public Spend(String name, String content, int money, String note,boolean is) {

        this.name = name;
        this.content = content;
        this.money = money;
        this.note = note;
        this.isIncome = is;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isIncome() {
        return isIncome;
    }

    public void setIncome(boolean income) {
        isIncome = income;
    }
}
