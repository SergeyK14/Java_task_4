package Homework_4;

import java.util.LinkedList;
import java.util.Scanner;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class Task_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList <Integer> linklist = new LinkedList<>();
        Integer e;
        System.out.print("Введите число элементов: ");
        Integer number = scn.nextInt();
        for (int i = 0; i < number; i++){
            System.out.println("Введите элемент: ");
            e = scn.nextInt();
            linklist.add(e);
        }
        System.out.println(linklist);

        LinkedList <Integer> linklist_2 = new LinkedList<>();
        for (int i = linklist.size()-1; 0 <= i && i < linklist.size(); i--){
            linklist_2.add(linklist.get(i));
        }
        System.out.println(linklist_2);
        scn.close();
    }
}
