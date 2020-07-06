package sample;

import java.util.ArrayList;
import java.util.List;

public abstract class SpendManager {
    private static List<Spend> spendList = new ArrayList<>();

    public static void  add(Spend s){
        spendList.add(s);
    }
    public static void delete(Spend s){
        spendList.remove(s);
    }

    public static List<Spend> getSpendList() {
        return spendList;
    }
}
