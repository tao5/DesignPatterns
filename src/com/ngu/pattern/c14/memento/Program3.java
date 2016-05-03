package com.ngu.pattern.c14.memento;

public class Program3 {

	public static void main(String[] args) {
		Program3Originator originator = new Program3Originator();
		originator.setState("on");
		originator.show();
		
		Program3MementoManager mementoManager = new Program3MementoManager();
		mementoManager.setMemento(originator.createMemento());
		
		originator.setState("off");
		originator.show();
		
		originator.setMementoState(mementoManager.getMemento());
		originator.show();
	}
	
}
