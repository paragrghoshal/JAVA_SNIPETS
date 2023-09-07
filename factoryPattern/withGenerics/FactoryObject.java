package factoryPattern.withGenerics;

public class FactoryObject {

    public <T extends IDriver> T getObjectClass(DriverList driverList) {
        T t = null ;
        try{
            t = (T) driverList.getClazz()
                    .getDeclaredConstructor(int.class)
                    .newInstance(driverList.getTheInt());

        } catch(Exception e) {
            System.out.println("######## this is the exception : "+e.getMessage());
        }
        return t;
    }
    
}
