package pl.edu.ug.sgpwcr.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buildings {
    private long id;
    private int townHallLevel;
    private int armyProducingBuildingLevel;
    private int woodProducingBuildingLevel;
    private int clayProducingBuildingLevel;
    private int ironProducingBuildingLevel;

    public Buildings(long id, int townHallLevel, int armyProducingBuildingLevel, int woodProducingBuildingLevel, int clayProducingBuildingLevel, int ironProducingBuildingLevel) {
        this.id = id;
        this.townHallLevel = townHallLevel;
        this.armyProducingBuildingLevel = armyProducingBuildingLevel;
        this.woodProducingBuildingLevel = woodProducingBuildingLevel;
        this.clayProducingBuildingLevel = clayProducingBuildingLevel;
        this.ironProducingBuildingLevel = ironProducingBuildingLevel;
    }

    public Buildings() {
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTownHallLevel() {
        return townHallLevel;
    }

    public void setTownHallLevel(int townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    public int getArmyProducingBuildingLevel() {
        return armyProducingBuildingLevel;
    }

    public void setArmyProducingBuildingLevel(int armyProducingBuildingLevel) {
        this.armyProducingBuildingLevel = armyProducingBuildingLevel;
    }

    public int getWoodProducingBuildingLevel() {
        return woodProducingBuildingLevel;
    }

    public void setWoodProducingBuildingLevel(int woodProducingBuildingLevel) {
        this.woodProducingBuildingLevel = woodProducingBuildingLevel;
    }

    public int getClayProducingBuildingLevel() {
        return clayProducingBuildingLevel;
    }

    public void setClayProducingBuildingLevel(int clayProducingBuildingLevel) {
        this.clayProducingBuildingLevel = clayProducingBuildingLevel;
    }

    public int getIronProducingBuildingLevel() {
        return ironProducingBuildingLevel;
    }

    public void setIronProducingBuildingLevel(int ironProducingBuildingLevel) {
        this.ironProducingBuildingLevel = ironProducingBuildingLevel;
    }
}
