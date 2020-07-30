/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerations;

/**
 *
 * @author steph
 */
public class Enumerations {
    // Created a Data Type called Season
    // Set the possible values of the Season Data Type
    public enum Season { WINTER, SPRING, SUMMER, FALL };
    public enum DaysOfWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };
    public enum MonthsOfYear { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,OCTOBER, DECEMBER };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s);

        DaysOfWeek d = DaysOfWeek.SATURDAY;
        System.out.println(d);

        MonthsOfYear m = MonthsOfYear.FEBRUARY;
        System.out.println(m);

        MonthsOfYear m2 = MonthsOfYear.MARCH;
        System.out.println(m2);
    }    
}
