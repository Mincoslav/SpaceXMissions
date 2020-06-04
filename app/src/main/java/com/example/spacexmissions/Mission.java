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
}
