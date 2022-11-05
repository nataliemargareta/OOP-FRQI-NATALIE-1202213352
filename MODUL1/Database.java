package MODUL1;

import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> ListMenu = new ArrayList<Menu>{};

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu) {
        ListMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        System.out.println("Our Menu");
        System.out.println("=========================");
        for (int i = 1; i < ListMenu.size(); i++) {
            System.out.println(1 + i + "|" + ListMenu.get(i).name + "|" + ListMenu.get(i).Category + "|" + ListMenu.get(i).price);
    }


    // TODO Create Method to Search Menu from Database
    public void SearchMenu(Menu menu) {
    }

}