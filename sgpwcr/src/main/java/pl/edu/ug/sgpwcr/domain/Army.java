package pl.edu.ug.sgpwcr.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Army {
    private long id;
    private long amount;

    public Army(long id, long amount) {
        this.id = id;
        this.amount = amount;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
