package Homework_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//В калькулятор добавьте возможность отменить последнюю операцию.
public class Task_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File ("calculator.txt");
        
        System.out.println("Введите первое число: ");
        Scanner iScanner = new Scanner(System.in);
        Double number_1 = iScanner.nextDouble();
        
        Scanner iScanner_z = new Scanner(System.in);
        System.out.println("Введите знак: ");
        char znak = iScanner.next().charAt(0);
        
        Scanner iScanner_2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        Double number_2 = iScanner.nextDouble();
        
        double rez = 0;
        if (znak == '+'){
            rez = number_1 + number_2;
        }
        if (znak == '-'){
            rez = number_1 - number_2;          
        }    
        if (znak == '*'){
            rez = number_1 * number_2;
        }
        if (znak == '/'){
            rez = number_1 / number_2;
        }     
        System.out.printf(" %s %c %s = %s ", number_1, znak, number_2, rez);
        sb.append(number_1);
        sb.append(znak);
        sb.append(number_2);
        sb.append(" = ");
        sb.append(rez);
        System.out.println(("\n"));
        System.out.println("Хотите удалить последнюю операцию?");
        Scanner iScanner_d = new Scanner(System.in);
        System.out.println("yes/no: ");
        String del = iScanner_d.nextLine();
        if (del == "yes"){
            sb.delete(0, 13);
            sb.append("Операция успешно удалена");
        }
        else {System.out.print("");}
      
        try{
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.write("\n");
            fr.close();
        }
        catch(IOException error){
            System.out.println("Ошибка записи ");}
        
        iScanner.close();
        iScanner_z.close();
        iScanner_2.close();
        iScanner_d.close();
    }
}

