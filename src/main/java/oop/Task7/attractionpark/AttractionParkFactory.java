package oop.Task7.attractionpark;

import oop.Task7.interfaces.EmployeesFactory;

public class AttractionParkFactory implements EmployeesFactory {
    private static volatile AttractionParkFactory object;

    private AttractionParkFactory(){}

    public static AttractionParkFactory getObject(){
        AttractionParkFactory localObject = object;
        if(localObject == null){
            synchronized (AttractionParkFactory.class){
                localObject = object;
                if (localObject == null){
                    object = localObject = new AttractionParkFactory();
                }
            }
        }
        return localObject;
    }

    @Override
    public AttractionsCleaner getCleaner() {
        return new AttractionsCleaner();
    }

    @Override
    public AttractionsRepairer getRepairer() {
        return new AttractionsRepairer();
    }

    @Override
    public AttractionParkSecurity getSecurity() {
        return new AttractionParkSecurity();
    }
}
