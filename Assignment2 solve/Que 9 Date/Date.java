class Date {
    private int day;
    private int month;
    private int year;

    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean isValid() {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth()) {
            return false;
        }
        if (year < 1 || year > 9999) {
            return false;
        }
        return true;
    }
    public int getDayOfWeek() {
        int y = this.year;
        int m = this.month;
        if (m < 3) {
            y--;
            m += 12;
        }
        int d = day;
        int c = y / 100;
        y = y % 100;
        int w = (13 * (m + 1)) / 5;
        w += d;
        w += y;
        w += y / 4;
        w += c / 4;
        w -= 2 * c;
        w = (w % 7 + 7) % 7;
        return w;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public Date getNextDay() {
        int d = day + 1;
        int m = month;
        int y = year;
        if (d > getDaysInMonth()) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }
        return new Date(d, m, y);
    }

    public Date getPreviousDay() {
        int d = day - 1;
        int m = month;
        int y = year;
        if (d < 1) {
            m--;
            if (m < 1) {
                m = 12;
                y--;
            }
            d = getDaysInMonth();
        }
        return new Date(d, m, y);
    }

    private int getDaysInMonth() {
        if (month == 2) {
            if (isLeapYear()) {
                return 29;
            }
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }


    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }


public static void main(String[] args) {
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid());
System.out.println(date.getDayOfWeek());
System.out.println(date.isLeapYear());
Date nextDay = date.getNextDay();
System.out.println(nextDay); 
Date previousDay = date.getPreviousDay();
System.out.println(previousDay);
}
}