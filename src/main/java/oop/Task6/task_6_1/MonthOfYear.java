package oop.Task6.task_6_1;

public enum MonthOfYear{
    JANUARY(31, "Январь"),
    FEBRUARY(28, "Февраль"),
    MARCH(31, "Март"),
    APRIL(30, "Апрель"),
    MAY(31, "Май"),
    JUNE(30, "Июнь"),
    JULY(31, "Июль"),
    AUGUST(31, "Август"),
    SEPTEMBER(30, "Сентябрь"),
    OCTOBER(31, "Октябрь"),
    NOVEMBER(30, "Ноябрь"),
    DECEMBER(31, "Декабрь");

    private String monthNameByRussian;

    MonthOfYear(int counter, String name) {
        this.monthNameByRussian = name;
    }

    public String getNextMonth(){
        switch (this){
            case DECEMBER:
                return values()[0].monthNameByRussian;
            default:
                return values()[ordinal() + 1].monthNameByRussian;
        }
    }

    public String getPreviousMonth(){
        switch (this){
            case JANUARY:
                return values()[11].monthNameByRussian;
            default:
                return values()[ordinal() - 1].monthNameByRussian;
        }
    }

    public String getSeason(){
        switch(this){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return "WINTER";
            case MARCH:
            case APRIL:
            case MAY:
                return "SPRING";
            case JUNE:
            case JULY:
            case AUGUST:
                return "SUMMER";
            case OCTOBER:
            case NOVEMBER:
            case SEPTEMBER:
                return "AUTUMN";
            default:
                return "Incorrect data!";
        }
    }

    @Override
    public String toString() {
        return "Month of year: { "
                + getPreviousMonth() +
                " -> " + monthNameByRussian +
                " -> " + getNextMonth() +
                " | " + this.name() +
                " | " + getSeason() + " }";
    }
}

