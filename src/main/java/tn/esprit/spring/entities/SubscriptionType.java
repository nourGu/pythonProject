package tn.esprit.spring.entities;

public enum SubscriptionType {
    FREE("Free Test"),
    MOUNTHLY("Mounthly Subscription"),
    PACKAGE("Package 3 mounth");
    private final String name;
    SubscriptionType(String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }
}
