package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();
    @Size(max = 400)
private String description;
    public Skill(String aDescription){
        super();
        this.description= aDescription;

    }
    public Skill(){
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}