package com.company;

public class Main {

    public static void main(String[] args) {
	  Boss boss = new Boss();
	  boss.setHeight(100);
	  boss.setDamage(20);
	  boss.setProtectionType("Magic");
        System.out.println(boss.getHeight() + " " + boss.getDamage() +"" +
                " " + boss.getProtectionType());
		for (int i = 0; i < createHeroes().length; i++) {
			System.out.println(createHeroes()[i].getHeight() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperpower());
		}
    }

    public static Hero[] createHeroes(){
    	Hero magic = new Hero(100, 10);
    	Hero medic = new Hero(150, 15, "medic");
    	Hero golem = new Hero(120, 10);
    	Hero[] heroes = {magic, medic, golem};
    	return heroes;

	}
}
