package Challange97;

enum EnumDayWeekend {
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true);
        private final boolean isWeekend;
        private EnumDayWeekend(boolean isWeekend){
            this.isWeekend = isWeekend;
        }
        public String getType(){
            return isWeekend? "Weekend" : "Weekday";
        }
}
