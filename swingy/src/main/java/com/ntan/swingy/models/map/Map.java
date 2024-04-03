package com.ntan.swingy.models.map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ntan.swingy.models.hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private static final Logger log = LogManager.getLogger(Map.class);
    private List<List<Cell>> cells;
    private Integer size;

    private static Map instance;

    public static Map getInstance() {
        if (instance == null)
            instance = new Map();
        return instance;
    }

    public Map() {
        this.cells = new ArrayList<List<Cell>>();
        this.size = 0;
    }

    public void generateMapOfSize(Integer size, Hero hero) {
        this.size = size;
        if (cells != null)
            cells.clear();

        // Instantiate map
        int cellId = 0;
        for (int x = 0; x < size; x++) {
            this.cells.add(new ArrayList<Cell>());
            List<Cell> row = this.cells.get(x);
            for (int y = 0; y < size; y++) {
                row.add(new Cell(cellId++, null, null, null, null, x, y, null, null, false));
            }
        }

        // Set neighbors
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Cell curr = getCellByXY(x, y);
                curr.setTop(y > 0 ? getCellByXY(x, y - 1) : null);
                curr.setBottom(y < size - 1 ? getCellByXY(x, y + 1) : null);
                curr.setRight(x < size - 1 ? getCellByXY(x + 1, y) : null);
                curr.setLeft(x > 0 ? getCellByXY(x - 1, y) : null);
                if (curr.getBottom() == null || curr.getTop() == null || curr.getLeft() == null
                        || curr.getRight() == null) {
                    curr.setExit(true);
                }
                if (x == size / 2 && y == size / 2) {
                    curr.setHero(hero);
                    hero.setX(x);
                    hero.setY(y);
                }
            }
        }
    }

    public Cell getCellByXY(Integer x, Integer y) {
        return this.cells.get(x).get(y);
    }

    public void printMap() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Cell curr = getCellByXY(x, y);
                System.out.println("Cell[" + x + "][" + y + "] - id[" + curr.id + "]");
                System.out.println("top[" + (curr.getTop() != null ? curr.getTop().id : null ) +
                         "] right[" + (curr.getRight() != null ? curr.getRight().id : null) +
                         "] left[" + (curr.getLeft() != null ? curr.getLeft().id : null) +
                         "] bottom[" + (curr.getBottom() != null ? curr.getBottom().id : null) + "]");
                System.out.println(
                        "hero[" + curr.getHero() + "] vilain[" + curr.getVilain() + "] isExit[" + curr.isExit() + "]");
            }
        }
    }

    public void setMap(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public List<List<Cell>> getMap() {
        return cells;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
}
