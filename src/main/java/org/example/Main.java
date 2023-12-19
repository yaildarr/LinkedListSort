package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();
        System.out.println("Сколько объектов необходимо?");
        int kol = scanner.nextInt();
        for (int i = 1; i <= kol; i++) {
            System.out.println("Введите " + i + " элемент");
            Element element = new Element(scanner.nextInt());
            list.listAdd(element);
        }
        menu();
        while (true){
            String askMenu = scanner.nextLine();
            if (askMenu.equals("1")){
                System.out.println("Введите значение элемента");
                Element element = new Element(scanner.nextInt());
                list.listAdd(element);
                menu();
            } else if (askMenu.equals("2")){
                list.listOutput();
                menu();
            } else if (askMenu.equals("3")){
                list.sort();
                list.listOutput();
                menu();
            } else if (askMenu.equals("4")){
                System.out.println(list.min());
            } else if (askMenu.equals("5")){
                System.out.println(list.max());
            }
        }
    }
    public static void menu(){
        System.out.println(" 1.Добавить элемент\n 2.Вывести массив\n 3.Отсортировать массив\n 4.Минимальное\n 5.Максимальное");
    }
}