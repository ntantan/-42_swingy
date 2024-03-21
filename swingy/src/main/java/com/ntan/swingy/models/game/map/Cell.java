package com.ntan.swingy.models.game.map;

import com.ntan.swingy.models.game.hero.Hero;
import com.ntan.swingy.models.game.vilains.Vilain;

public class Cell {
    Integer id;
    Cell top;
    Cell right;
    Cell bottom;
    Cell left;

    Integer x;
    Integer y;

    Vilain vilain;
    Hero hero;

    boolean isExit;

    public Cell(Integer id, Cell top, Cell right, Cell bottom, Cell left, Integer x, Integer y, Vilain vilain, Hero hero, boolean isExit) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
        this.x = x;
        this.y = y;
        this.vilain = vilain;
        this.hero = hero;
        this.isExit = isExit;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTop(Cell top) {
        this.top = top;
    }

    public Cell getTop() {
        return top;
    }

    public void setBottom(Cell bottom) {
        this.bottom = bottom;
    }

    public Cell getBottom() {
        return bottom;
    }

    public void setRight(Cell right) {
        this.right = right;
    }

    public Cell getRight() {
        return right;
    }

    public void setLeft(Cell left) {
        this.left = left;
    }

    public Cell getLeft() {
        return left;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public void setVilain(Vilain vilain) {
        this.vilain = vilain;
    }

    public Vilain getVilain() {
        return vilain;
    }

    public boolean isExit() {
        return isExit;
    }

    public void setExit(boolean isExit) {
        this.isExit = isExit;
    }
}
