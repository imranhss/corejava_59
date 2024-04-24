package showcurrenttime59;

public class ShowCurrentTime59 {

    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis();
//        System.out.println(currentTime);
//        long seconds=currentTime/1000;
//        System.out.println(seconds);
//        long minutes=seconds/60;
//        System.out.println(minutes);
//        long hours=minutes/60;
//        System.out.println(hours);
//        long days= hours/24;
//        System.out.println(days);
//        long motns=days/30;
//        System.out.println(motns);
//        long years=motns/12;
//        System.out.println(years);

//long totalSeconds = currentTime / 1000;
//long currentSecond = totalSeconds % 60;
//long totalMinutes = totalSeconds / 60;
//long currentMinute = totalMinutes % 60;
//
// // Obtain the total hours
// long totalHours = (totalMinutes / 60)+6;
//
// // Compute the current hour
// long currentHour = totalHours % 24;
//
// // Display results
// System.out.println("Current time is " + currentHour + ":"
// + currentMinute + ":" + currentSecond + " GMT 6+");
        double i = 3.50, j = 3.22;

        double preResult = i * j;
        int result = (int) (i * j);

        System.out.println(preResult);
        System.out.println(result);
    }

}
