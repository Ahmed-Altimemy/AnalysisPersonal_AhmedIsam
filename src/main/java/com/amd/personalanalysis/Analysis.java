package com.amd.personalanalysis;

public class Analysis {
    private int id;
    private String type;

    public Analysis(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //to display object as a string in spinner
    @Override
    public String toString() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Analysis){
            Analysis c = (Analysis)obj;
            if(c.getType().equals(type) && c.getId()==id ) return true;
        }

        return false;
    }
}
