package com.company;


public class Main {
    public static void main(String[] args) {
        Weapon wea = new Weapon("Calibri", "Cold");
        Boss boss = new Boss(200, 50, wea);
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getWeapon().getName() + " " + boss.getWeapon().getType());
        System.out.println(boss.getInfo());

        Weapon wea1 = new Weapon("Calisdbri", "Coldsfsdd");
        Boss boss1 = new Boss(2200, 520, wea1);
        System.out.println(boss1.getInfo());

        Weapon bow = new Weapon("Death", "Bow");
        Skeletons skeletons1 = new Skeletons(50,5,bow,25);
        System.out.println(skeletons1.getInfo());

        Weapon bow1 = new Weapon("Life", "Bow");
        Skeletons skeletons2 = new Skeletons(150, 51, bow1, 125);
        System.out.println(skeletons2.getInfo());


    }
}


/*Создать класс Weapon (Оружие), с приватными полями тип оружия и название
оружия.
Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.

Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
геттеры и сеттеры для этого поля.
● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
полям). Затем распечатать всю информацию о боссе.
*/