package Challange96;
enum Day{
    Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday;
}
public class EnumDay {
    public static void main(String[] args){
        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
