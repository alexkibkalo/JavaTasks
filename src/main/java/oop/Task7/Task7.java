package oop.Task7;

import oop.Task7.attractionpark.AttractionParkFactory;
import oop.Task7.attractionpark.AttractionParkSecurity;
import oop.Task7.attractionpark.AttractionsCleaner;
import oop.Task7.attractionpark.AttractionsRepairer;
import oop.Task7.autopark.AutoCleaner;
import oop.Task7.autopark.AutoRepairer;
import oop.Task7.autopark.AutoparkFactory;
import oop.Task7.autopark.AutoparkSecurity;
import oop.Task7.interfaces.Cleaner;

public class Task7 {

    private static Cleaner getCleanerByFactory(String cleanerType){
        switch (cleanerType.toUpperCase()) {
            case "ATTRACTIONPARK":
                return new AttractionsCleaner();
            case "AUTOPARK":
                return new AutoCleaner();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        AutoparkFactory autopark = AutoparkFactory.getObject();
        AutoparkSecurity autoparkSecurity = autopark.getSecurity();
        AutoRepairer autoRepairer = autopark.getRepairer();
        Cleaner autoCleaner = Task7.getCleanerByFactory("AUTOPARK");

        autoparkSecurity.doWork();
        autoRepairer.doRepairing();
        if(autoCleaner != null){
            autoCleaner.doCleaning();
        }

        AttractionParkFactory attractionPark = AttractionParkFactory.getObject();
        AttractionParkSecurity attractionParkSecurity = attractionPark.getSecurity();
        AttractionsRepairer attractionsRepairer = attractionPark.getRepairer();
        Cleaner attractionCleaner = Task7.getCleanerByFactory("ATTRACTIONPARK");

        attractionParkSecurity.doWork();
        attractionsRepairer.doRepairing();
        if(attractionCleaner != null) {
            attractionCleaner.doCleaning();
        }
    }
}
