package com.ngu.pattern.c14.memento;

public class Program2StateMemento {

	private int vitality;
	private int attack;
	private int defense;

	public Program2StateMemento(int vitality, int attack, int defense) {
		super();
		this.vitality = vitality;
		this.attack = attack;
		this.defense = defense;
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

	@Override
	public String toString() {
		return "Program2StateMemento [vitality=" + vitality + ", attack=" + attack + ", defense=" + defense + "]";
	}
	
	

}
