package hackerRankPractice.thirtyDayChallenge.calendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*

what are we doing?
-scope
-imports
-packages
-figuring out why the stuff we've been doing works

package: group of similar classes

types of packages
1. user-defined packages
2. built-in packages

* import packages to get access to classes, methods, properties, etc

* built in - do not have to download or make anything new to use it

* import al needed packages except java.lang

import pkg1.pkg2.class
import pkg1.pkg2.*
import pkg1.*


*/

public class CalendarPractice {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 111);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }

}

/*
*/