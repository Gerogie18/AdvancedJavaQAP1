public class TestTime {
    public static void main (String[] args) {
        //establish time objects
        Time t1 = new Time();
        Time t2 = new Time();

        //set time objects
        t1.setTime(21,10,15);
        t1.setHour(10);
        t1.setMinute(20);
        t1.setSecond(25);

        //log current time objects
        System.out.println("   Current Time Objects");
        System.out.println("t1:" +t1.toString());
        System.out.println("t2:" +t2.toString());
        System.out.println();

        //manipulate time objects
        t1.nextSecond();
        t2.previousSecond();

        //log new time objects
        System.out.println("   Manipulated Time Objects");
        System.out.println("t1:" +t1.toString());
        System.out.println("t2:" +t2.toString());

    }
}
