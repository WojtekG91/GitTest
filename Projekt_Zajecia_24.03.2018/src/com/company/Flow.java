package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {
    public static int ourScanner() {
        int result = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            CarDataWraper carDataWraper = new CarDataWraper();
            try {
                System.out.println("Rent price");
                carDataWraper.rentPrice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getCause());
                System.out.println("Zepsuło się");
                continue;
            }
            break;
        }
        return result;
    }

}

