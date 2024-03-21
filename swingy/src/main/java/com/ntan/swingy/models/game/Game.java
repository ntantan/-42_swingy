package com.ntan.swingy.models.game;

import com.ntan.swingy.models.db.SQLiteJDBC;
import com.ntan.swingy.models.game.hero.Hero;

public class Game 
{
    public static void main( String[] args )
    {
        
        Hero hero = new Hero(0, "bob", "knight", 1, 0, 5, 5, 20);
        // System.out.println(test.getName());
        SQLiteJDBC.main(args);
    }
}
