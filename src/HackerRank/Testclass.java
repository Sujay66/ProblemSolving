package HackerRank;

public class Testclass {
    public static void main(String[] args) {

        System.out.println(nextClosestTime("11:00"));

    }

    public static String nextClosestTime(String time) {
        String finalTime = "";
        String hr = time.substring(0, 2);
        String mi = time.substring(3, 5);
        System.out.println("hour:" + hr + "minutes:" + mi);
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3, 5));
        Boolean valid = true;
        while (true) {
            if (++min == 60) {
                min = 0;
                ++hour;
                hour %= 24;
            }
            String currHour = String.format("%02d", hour);
            String currMinute =  String.format("%02d", min);

            if ((currHour.equals(hr) || currHour.equals(mi) )&&
                    currMinute.equals(hr)||currMinute.equals(mi)) {
                finalTime = currHour+currMinute;
                break;
            }

        }
        return finalTime;
    }
}
