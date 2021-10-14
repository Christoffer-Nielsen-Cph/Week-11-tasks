package Dogs;

import java.util.ArrayList;

public class Dog {
    private String dogName;
    private String owner;
    private boolean isHungry;
    private ArrayList<String>offSpring = new ArrayList<String>();

    public Dog(String dogName, boolean isHungry) {
        this.dogName = dogName;
        this.isHungry=isHungry;
        //ArrayList<String>offSpring = new ArrayList<String>();
    }

    public String feedDog() {
        String feed = "Feeding dog!";
        setHungry();
        return feed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOffSpring(String offSpring) {
        this.offSpring.add(offSpring);

    }

    public ArrayList<String> getOffSpring() {
        return offSpring;
    }

    public void setHungry() {
        isHungry = false;
    }
}
