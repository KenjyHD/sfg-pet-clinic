package kenjy.sfgpetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Specialty extends BaseEntity {
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
