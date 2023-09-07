package factoryPattern.withoutGenerics;

public enum DriverList {
    LOCAL(LocalDriver.class,100),
    SAUCE(SauceDriver.class,20);

    private final Class<?> clazz;
    private final int theInt;

    DriverList(Class<?> clazz,int theInt){
        this.clazz = clazz;
        this.theInt = theInt;
    }

    public Class<?> getClazz(){
        return this.clazz;
    }

    public int getTheInt(){
        return this.theInt;

    }

    
}
