package ru.gb.hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import ru.gb.example.Multiply;
import ru.gb.example.Number;

public class Main {
    public static void main (String[] args){
        try(FileWriter writer = new FileWriter("notes.txt", true)){
            Scanner in = new Scanner(System.in);
            System.out.println("Make note: ");
            String note = in.nextLine();

            Date date = new Date();
            writer.write(date + " --> " + note + System.lineSeparator());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Multiply.multi(2,5));
        System.out.println(Number.number(10));

    }
}
