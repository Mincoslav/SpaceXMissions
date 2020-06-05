package com.example.spacexmissions;

import java.io.Serializable;

public class Mission implements Serializable {


    private String name;

    private int id;

    private boolean success;

    private String description;

    public Mission(String name, int id, boolean success, String description) {
        this.name = name;
        this.id = id;
        this.success = success;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
