package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "datatemperature")
public class DataTemperature {

    @Id
    @GeneratedValue
    private int tempid;
    private int temperature;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Person person;

    public DataTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTempid() {
        return tempid;
    }

    /*
    public void setTempid(int tempid) {
        this.tempid = tempid;
    }
    */

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
