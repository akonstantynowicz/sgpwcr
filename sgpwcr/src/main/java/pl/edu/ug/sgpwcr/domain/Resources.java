package pl.edu.ug.sgpwcr.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resources {
    private long id;
    private long wood;
    private long food;
    private long clay;
    private long iron;

    public Resources(long id, long wood, long food, long clay, long iron) {
        this.id = id;
        this.wood = wood;
        this.food = food;
        this.clay = clay;
        this.iron = iron;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWood() {
        return wood;
    }

    public void setWood(long wood) {
        this.wood = wood;
    }

    public long getFood() {
        return food;
    }

    public void setFood(long food) {
        this.food = food;
    }

    public long getClay() {
        return clay;
    }

    public void setClay(long clay) {
        this.clay = clay;
    }

    public long getIron() {
        return iron;
    }

    public void setIron(long iron) {
        this.iron = iron;
    }
}
