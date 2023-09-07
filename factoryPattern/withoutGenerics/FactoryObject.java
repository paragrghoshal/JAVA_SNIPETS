package factoryPattern.withoutGenerics;

public class FactoryObject {

    public IDriver getObjectClass(DriverList driverList) {
        IDriver t = null ;
        try{
            t = (IDriver)driverList.getClazz()
                    .getDeclaredConstructor(int.class)
                    .newInstance(driverList.getTheInt());

        } catch(Exception e) {
            System.out.println("######## this is the exception : "+e.getMessage());
        }
        return t;
    }
    
}
