package com.zipcodewilmington.froilansfarm.weekdayRoutine;

public enum Weekdays {
    MONDAY(new MondayRoutine()),
    TUESDAY(new TuesdayRoutine()),
    WEDNESDAY(new WednesdayRoutine()),
    THURSDAY(new ThursdayRoutine()),
    FRIDAY(new FridayRoutine()),
    SATURDAY(new SaturdayRoutine()),
    SUNDAY(new SundayRoutine());

    private WeekdayRoutine routine;

    Weekdays(WeekdayRoutine routine){
        this.routine = routine;
    }

    public WeekdayRoutine getRoutine(){
        return this.routine;
    }
}


