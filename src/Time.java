public class Time {
    //instance variables
    private int hour; //[0,23]
    private int minute; //[0,59]
    private int second; //[0,59]

    // Assignment indicated no input validation needed

    public Time () {
        this(0,0,0);
    }

    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //get methods
    public int getHour () {
        return hour;
    }
    public int getMinute () {
        return minute;
    }
    public int getSecond () {
        return second;
    }

    //set methods
    public void setHour (int hour) {
        this.hour = hour;
    }
    public void setMinute (int minute) {
        this.minute = minute;
    }
    public void setSecond (int second) {
        this.second = second;
    }
    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //format method
    public String toString () {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //manipulation methods
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
