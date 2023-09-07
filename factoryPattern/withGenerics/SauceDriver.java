package factoryPattern.withGenerics;

public class SauceDriver implements IDriver{
    int i;
    public SauceDriver(int i){
        this.i = i ;
    }
    @Override
    public String getDriver() {
        return "in Sauce : "+this.i;
    }
    
}
