package com.alexolmedo.learnjava;

/**
 * Created by Alexander on 10/11/2017.
 */

public class Demo {

    public static void main(String[] args) {
        Player alex = new Player("John Smith", 8);
//        System.out.println(alex.getHandleName());
//        System.out.println("Level: " + alex.getLevel());
//        System.out.println("Lives: " + alex.getLives());
//        System.out.println(alex.getWeapon().getName());
//        Weapon alexsWeapon = alex.getWeapon();
//        System.out.println(alexsWeapon.getName());
//        System.out.println(alex.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        alex.setWeapon(myAxe);
//        System.out.println(alex.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        alex.pickUpLoot(redPotion);

        alex.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        alex.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        alex.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        alex.showInventory();

//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 9);
        boolean wasDeleted = alex.dropLoot(redPotion);
        System.out.println(wasDeleted);
        alex.showInventory();
    }
}
