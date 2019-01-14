package models;

import abstracts.Restaurant;

public abstract class chinese_restaurant extends Restaurant {


    public chinese_restaurant(String name, String address) {
        super(name, address);

    }

    @Override
    public double value() {
        return 0;
    }

}
