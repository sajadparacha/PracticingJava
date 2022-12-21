package java8.streams;

public class Dish {
    private String name;
    private Type type;
    private boolean vegetarian;
    private int calories;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {MEAT,FISH,OTHER};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.setType(type);
    }
}
