package com.bp.apirestbrprev.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private String description;

    private String urlPicture;

    private Double value;

    public Product() {

    }

    public static long getSerialVersionUID() { return serialVersionUID; }
    public void setId(long id) { this.id = id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlPicture() {
        return urlPicture;
    }
    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }

}
