package Challange97;

public class TestEnumWeekend {
    public static void main(String[] args){
        for(EnumDayWeekend day : EnumDayWeekend.values()){
            System.out.println("Day = "+day+"       :          "+day.getType());
        }
    }
}
