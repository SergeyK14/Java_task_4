package Homework_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task_2 {
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
        // if (linklist.get(1) == "4"){
        //     System.out.println(linklist.pollFirst());
        // }
        // else {
        //     linklist.dequeue(e);
        // }
    public static first(list) {
        int i = list.size();
        return list(i);
    }

    public static dequeue(list) {
        int i = 0;
        return list(i);
        list.remove(i);
    }
    public static enqueue(list, int v) {
        int temp = list(v);
        for (int i = 1; i < list.size(); i++){
                list (i-1) = list (i);
            }
        list( list.size()) = temp;    
        }


        System.out.println(linklist);
        scn.close();
    }
    
}


