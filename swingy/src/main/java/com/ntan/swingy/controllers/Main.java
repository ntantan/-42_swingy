package com.ntan.swingy.controllers;

import com.ntan.swingy.controllers.actions.Move;
import com.ntan.swingy.models.db.SQLiteJDBC;
import com.ntan.swingy.models.hero.Hero;
import com.ntan.swingy.models.map.Map;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(0, "bob", "knight", 1, 0, 5, 5, 20);
        Map map = Map.getInstance();
        map.generateMapOfSize(5, hero);
        Move.up(hero);
        map.printMap();
        // System.out.println(test.getName());
        SQLiteJDBC.main();
    }
}
