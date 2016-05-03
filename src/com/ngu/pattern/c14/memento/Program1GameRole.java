package com.ngu.pattern.c14.memento;
import static com.ngu.pattern.Utils.*;

public class Program1GameRole {

	private int vitality;
	private int attack;
	private int defense;

	public void showState() {
		println("current state : vitality = " + vitality + ", acctck = " + attack + ", defense = " + defense);
	}
	
	public void initRole() {
		vitality = 100;
		attack = 100;
		defense = 100;
	}
	
	public void fight() {
		vitality = 0;
		attack = 0;
		defense = 0;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
	
}
