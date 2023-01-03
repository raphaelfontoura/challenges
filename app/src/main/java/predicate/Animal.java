package predicate;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwin;

    public Animal(String aName, boolean swimmer, boolean hopper) {
        species = aName;
        canHop = hopper;
        canSwin = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwin;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                '}';
    }
}
