package com.ntan.swingy.models.hero;

import java.util.logging.Logger;

import com.ntan.swingy.models.artifact.Armor;
import com.ntan.swingy.models.artifact.Helm;
import com.ntan.swingy.models.artifact.Weapon;
import com.ntan.swingy.models.map.Coordinate;

public class Hero {
    private static final Logger log = Logger.getLogger(Hero.class.getName());

    Integer id;
    String name;
    String heroClass;
    Integer level;
    Integer experience;
    Integer attack;
    Integer defense;
    Integer hitPoints;
    Weapon weapon;
    Armor armor;
    Helm helm;
    Coordinate coordinate;

    public Hero(Integer id, String name, String heroClass, Integer level, Integer experience, Integer attack,
            Integer defense, Integer hitPoints) {
        this.id = id;
        this.name = name;
        this.heroClass = heroClass;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
        this.coordinate = new Coordinate(0, 0);
    }

    public void log() {
        log.info("HERO INFO: id[" + this.id + "] name[" + this.name + "] heroClass[" + this.heroClass + "]["
                + this.level + "][" + this.experience + "][" + this.attack + "][");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeroClass(String hero_class) {
        this.heroClass = hero_class;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hit_points) {
        this.hitPoints = hit_points;
    }

    
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Integer getX() {
        return coordinate.getX();
    }

    public void setX(Integer x) {
        coordinate.setX(x);
    }

    public Integer getY() {
        return coordinate.getY();
    }

    public void setY(Integer y) {
        coordinate.setY(y);
    }
}
