/*
Autor: José Antonio Montes Pestana
Feacha: 16/02/2021
 */
package p_birthdayprogramerjose;

/**
 *
 * @author josemonpes
 */
public class P_BirthdayProgramerJose {

  
    public static void main(String[] args) {
       int day=13, month=9, year=2021;
       String stDat=bithDay_zellerMonlau(day, month, year);
        System.out.println("Internacional programmer's day: "+stDat+" sep2021");
    }
    private static String bithDay_zellerMonlau(int day, int month, int year) {
         String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;  
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
    
}
