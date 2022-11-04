package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kundordun raspisaniyasy");
        String   soz= sc.nextLine();
        Days days=Days.valueOf(soz.toUpperCase());
        switch (days){
            case MONDAY -> System.out.println(days+ " tehnikalik sabak bolot");
            case TUESDAY -> System.out.println(days+ " practikalyk sabak");
            case THURSDAY -> System.out.println(days+ " anglis til sabagi");
            case WEDNESDAY -> System.out.println(days+ " soft skill sabagi");
            case FRIDAY -> System.out.println(days+ "  Java okuim");
            case SATURDAY -> System.out.println(days+ " kod jazam");
            case SUNDAY -> System.out.println(days+  " es alam");
        }
    }
}
