package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public class Celebrate {
    enum CelebrateDay{
        NoCelebrate, WomanDate, NewYear, MansDay
    }

    public static void checkCelebrateDay(List<Employee> listEmployee){
        LocalDate todayDate = LocalDate.now();
        String date = todayDate.toString();
//        String date = "2024-12-31";
        String [] dateNew = date.split("-");
        int day = Integer.parseInt(dateNew[2]);
        int month = Integer.parseInt(dateNew[1]);
        CelebrateDay curentDay = null;
        if ((day == 31 && month == 12) || (day == 1 && month == 1)){
            curentDay = CelebrateDay.NewYear;
        } else if (day == 8 && month == 3){
            curentDay = CelebrateDay.WomanDate;
        } else if (day == 23 && month == 2){
            curentDay = CelebrateDay.MansDay;
        } else curentDay = CelebrateDay.NoCelebrate;
        switch (curentDay){
            case NoCelebrate:
                System.out.println("Today " + curentDay);
                break;
            case WomanDate:
                for (Employee employee: listEmployee){
                    if (employee.getGender().equals(Buyer.Gender.FEMALE)) {
                        System.out.println(employee.getName() + " " + employee.getSurname() + " С международным женским днем");
                    }
                }
                break;
            case MansDay:
                for (Employee employee: listEmployee){
                    if (employee.getGender().equals(Buyer.Gender.MALE)){
                        System.out.println(employee.getName() + " " + employee.getSurname() + " С днем защитника отечества");
                    }
                }
                break;
            case NewYear:
                for (Employee employee: listEmployee){
                    System.out.println(employee.getName() + " " + employee.getSurname() + " С новым годом");
                }
                break;
        }
    }
}
