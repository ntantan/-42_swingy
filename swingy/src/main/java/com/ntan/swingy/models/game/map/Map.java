package com.ntan.swingy.models.game.map;

import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
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

    private Map() {
    }

    public void generateMapOfSize(Integer size) {
        this.size = size;
        cells.clear();

        // Instantiate map
        int cellId = 0;
        for (int x = 0; x < size; x++) {
            this.cells.add(new ArrayList<Cell>());
            for (int y = 0; y < size; y++) {
                this.cells.get(x).add(new Cell(cellId++, null, null, null, null, x, y, null, null, false));
            }
        }

        // Set neighbors
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Cell curr = getCellByXY(x, y);
                curr.setTop(y > 0 ? getCellByXY(x, y - 1) : null);
                curr.setBottom(y < size ? getCellByXY(x, y + 1) : null);
                curr.setRight(x < size ? getCellByXY(x + 1, y) : null);
                curr.setLeft(x > 0 ? getCellByXY(x - 1, y) : null);
                if (curr.getBottom() == null || curr.getTop() == null || curr.getLeft() == null || curr.getRight() == null) {
                    curr.setExit(true);
                }
            }
        }
    }

    private Cell getCellByXY(Integer x, Integer y) {
        return this.cells.get(x).get(y);
    }

    public void printMap() {
        for (int x = 0; x < size; x++) {
            this.cells.add(new ArrayList<Cell>());
            for (int y = 0; y < size; y++) {
                Cell curr = getCellByXY(x, y);
                log.debug("Cell[" + x + "][" + y + "] - id[" + x + "]");
                log.debug("top[" + curr.getTop().id + "] right[" + curr.getRight().id + "] left[" + curr.getLeft().id + "] bottom[" + curr.getBottom().id + "]");
                log.debug("hero[" + curr.getHero() + "] vilain[" + curr.getVilain() + "] isExit[" + curr.isExit() + "]");
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
