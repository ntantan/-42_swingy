package com.ntan.swingy.controllers.actions;

import com.ntan.swingy.models.hero.Hero;
import com.ntan.swingy.models.map.Cell;
import com.ntan.swingy.models.map.Map;

public class Move {

    private static void move(Hero hero, Integer x, Integer y) {
        Cell heroCell = Map.getInstance().getCellByXY(hero.getX(), hero.getY());

        if (hero.getY() + y >= 0 && hero.getY() + y < Map.getInstance().getSize()
                && hero.getX() + x >= 0 && hero.getX() + x < Map.getInstance().getSize()){
            heroCell.setHero(null);
            hero.setY(hero.getY() + y);
            hero.setX(hero.getX() + x);
            Map.getInstance().getCellByXY(hero.getX(), hero.getY()).setHero(hero);
        }
    }

    public static void up(Hero hero) {
        System.out.println("Move up");
        move(hero, 0, -1);
    }

    public static void down(Hero hero) {
        System.out.println("Move down");
        move(hero, 0, 1);
    }

    public static void left(Hero hero) {
        System.out.println("Move left");
        move(hero, -1, 0);
    }

    public static void right(Hero hero) {
        System.out.println("Move right");
        move(hero, 1, 0);
    }
}
