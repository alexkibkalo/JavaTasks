package oop.Task7.autopark;

import oop.Task7.interfaces.EmployeesFactory;

//Singleton
public class AutoparkFactory implements EmployeesFactory {

    private static volatile AutoparkFactory object;

    private AutoparkFactory(){}

    public static AutoparkFactory getObject(){
        AutoparkFactory localObject = object;
        if(localObject == null){
            synchronized (AutoparkFactory.class){
                localObject = object;
                if (localObject == null){
                    object = localObject = new AutoparkFactory();
                }
            }
        }
        return localObject;
    }

    @Override
    public AutoCleaner getCleaner() {
        return new AutoCleaner();
    }

    @Override
    public AutoRepairer getRepairer() {
        return new AutoRepairer();
    }

    @Override
    public AutoparkSecurity getSecurity() {
        return new AutoparkSecurity();
    }
}
