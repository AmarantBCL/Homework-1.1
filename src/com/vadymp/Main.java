package com.vadymp;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Пупкин", "Вася");
        Human human2 = new Human("Сидоров", "Виталий", "Николаевич");
        Human human3 = new Human("Иванов", "Иван", "Петрович");
        System.out.println(human1.getFullName());
        System.out.println(human1.getShortName());
        System.out.println(human2.getFullName());
        System.out.println(human2.getShortName());
        System.out.println(human3.getFullName());
        System.out.println(human3.getShortName());
    }
}