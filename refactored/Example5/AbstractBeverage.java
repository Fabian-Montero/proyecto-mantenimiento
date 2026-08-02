
/**
 * The abstract class for beverages
 */
public abstract class Beverage {

    /**
     * The method that defines how beverages are prepared
     */
    public void prepare() {
        boilWater();
        brew();
        pourInCup();
        addExtras();
    }

    /**
     * Defines the behavior to boil water
     */
    private void boilWater() { 
        System.out.println("Boiling water"); 
    }

    /**
     * Defines the behavior to pour the beverage in a cup
     */
    private void pourInCup() { 
        System.out.println("Pouring in cup"); 
    }

    /**
     * Brews the beverage
     */
    protected abstract void brew();

    /**
     * Adds extras to the beverage
     */
    protected abstract void addExtras();
}
