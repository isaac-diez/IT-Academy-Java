package org.example;

import java.util.HashSet;

public class RestaurantList {

    private HashSet<Restaurant> restaurantList;

    public RestaurantList() {
        this.restaurantList = new HashSet<>();
    }

    public void addRestaurant(Restaurant restaurant) {

            if (restaurantList.contains(restaurant)) {
                System.out.println("Restaurant " + restaurant.getName() + " with score " + restaurant.getScore() + " already on the HashSet. Duplicates not allowed!");

            }

        restaurantList.add(restaurant);

    }

    @Override
    public String toString() {
        return "RestaurantList{" +
                "restaurantList=" + restaurantList +
                '}';
    }
}
