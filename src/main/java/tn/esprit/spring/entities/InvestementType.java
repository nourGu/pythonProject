package tn.esprit.spring.entities;

public enum InvestementType {
    SALE("Sale"),
    RENTING("Renting "),
    CALCULATOR("Financial calculator  ");
    private final String name;
    InvestementType(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }
}
