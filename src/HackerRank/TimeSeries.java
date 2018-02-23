package HackerRank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class TimeSeries implements Comparable<TimeSeries> {
    String dt;
    String str;
    int num;

    public TimeSeries(String dt, String str, int num) {
        this.dt = dt;
        this.str = str;
        this.num = num;
    }

    @Override
    public int compareTo(TimeSeries o) {
        Date dt1 = toDate(this.dt);
        Date dt0 = toDate(o.dt);
        if (dt1.compareTo(dt0) == 0) {
            return this.str.compareTo(o.str);
        }
        //for descending dates
        else if (dt1.compareTo(dt0) < 0)
            return 1;
        else return -1;
    }

    public Date toDate(String str) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM");
        Date date = null;
        try {
            date = (Date) formatter.parse(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        return date;
    }
}