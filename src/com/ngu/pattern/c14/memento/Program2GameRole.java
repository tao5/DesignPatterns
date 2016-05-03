package com.ngu.pattern.c14.memento;

import static com.ngu.pattern.Utils.*;

public class Program2GameRole {

	private int vitality;
	private int attack;
	private int defense;

	private Program2StateMemento memento;

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

	public Program2StateMemento saveState() {
		if (memento == null) {
			memento = new Program2StateMemento(vitality, attack, defense);
		} else {
			memento.setVitality(vitality);
			memento.setAttack(attack);
			memento.setDefense(defense);
		}
		return memento;
	}

	public void recoveryState(Program2StateMemento memento) {
		if (memento != null) {
			vitality = memento.getVitality();
			attack = memento.getAttack();
			defense = memento.getDefense();
		}
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
