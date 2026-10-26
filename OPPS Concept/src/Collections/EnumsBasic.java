package Collections;

public class EnumsBasic {
    enum Week{
        Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday;
        // these are enum constant
        // Public, static and fianl
        // since its final you can create child nums
        // type is week

        Week(){
            System.out.println("Constructor called for "+this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
//
//        System.out.println(week+" The day of the week...");
//        System.out.println(week.ordinal());
    }
}
