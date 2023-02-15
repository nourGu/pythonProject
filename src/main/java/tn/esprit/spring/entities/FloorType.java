package tn.esprit.spring.entities;

public enum FloorType {
    FIRST("First floor"),
    SECOND("Second Floor "),
    THIRD("Third Floor ");
    private final String name;
    FloorType(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }
}
