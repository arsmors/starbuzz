package com.example.android.star;

public class Food {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Food[] foods = {
            new Food("Soup", "A couple of espresso shots with steamed milk", R.drawable.soup),
            new Food("Burger", "Espresso, hot milk, and a steamed milk foam", R.drawable.burger),
            new Food("Fries", "Highest quality beans roasted and brewed fresh", R.drawable.fries)
    };

    //Each Drink has a name, description, and an image resource
    private Food(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}