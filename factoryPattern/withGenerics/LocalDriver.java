package factoryPattern.withGenerics;
public class LocalDriver implements IDriver {
    int i;

    public LocalDriver(int i){
        this.i = i;
    }

    @Override
    public String getDriver() {
        // TODO Auto-generated method stub
        return "In Local :"+this.i;
    }
    
}
