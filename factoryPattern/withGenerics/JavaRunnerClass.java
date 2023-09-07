package factoryPattern.withGenerics;

public class JavaRunnerClass {

    public static void main(String [] args){
        IDriver driver;
        FactoryObject factoryObject = new FactoryObject();
        driver = factoryObject.getObjectClass(DriverList.LOCAL);
        System.out.println("*************"+driver.getDriver());

        driver = factoryObject.getObjectClass(DriverList.SAUCE);
        System.out.println("*************"+driver.getDriver());
    }

}
