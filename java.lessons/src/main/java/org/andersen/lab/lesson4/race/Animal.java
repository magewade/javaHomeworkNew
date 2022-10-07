package org.andersen.lab.lesson4.race;

public abstract class Animal {
    protected String name;
    protected String breeds;
    protected int run;
    protected int swim;
    private static int counter;

    public Animal() {
        counter++;
    }

    public static int getCount() {
        return counter;
    }

    @Override
    public String toString() {
        return "Type " + breeds + ", Name " + name + "Can run " +
                run + "m." + "Can swim " + swim + "m.";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.breeds + " name " + this.name + " ran successfully " + distance + " metres.");
        } else {
            System.out.println(this.breeds + " name " + this.name + "didn't cover the distance");
        }
    }

    protected void swim(int distance) {
        if (swim >= distance) {
            System.out.println(this.breeds + " name " + this.name + " swam successfully " + distance + " metres.");
        } else {
            System.out.println(this.breeds + " name " + this.name + " didn't cover the distance.");
        }
    }

}
