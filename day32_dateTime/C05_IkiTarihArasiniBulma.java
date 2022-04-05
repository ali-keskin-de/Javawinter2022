package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugün= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1985,05,30);

        System.out.println(Period.between(dogumGunu,bugün).getYears());//36



    }
}
