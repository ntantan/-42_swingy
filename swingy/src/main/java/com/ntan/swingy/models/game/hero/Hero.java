package com.ntan.swingy.models.game.hero;

import java.util.logging.Logger;

public class Hero {
    private static final Logger log = Logger.getLogger( Hero.class.getName() );

    Integer id;
    String  name;
    String  heroClass;
    Integer level;
    Integer experience;
    Integer attack;
    Integer defense;
    Integer hitPoints;
    Weapon weapon;
    Armor armor;
    Helm helm;

    public Hero(Integer id, String name, String heroClass, Integer level, Integer experience, Integer attack, Integer defense, Integer hitPoints) {
        this.id = id;
        this.name = name;
        this.heroClass = heroClass;
        this.level = level;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
    }
    
    public void log() {
        log.info("HERO INFO: id[" + this.id + "] name[" + this.name + "] heroClass[" + this.heroClass + "][" + this.level + "][" + this.experience + "][" + this.attack + "][");
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
}
