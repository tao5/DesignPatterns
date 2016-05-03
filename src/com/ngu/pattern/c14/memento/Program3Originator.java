package com.ngu.pattern.c14.memento;
import static com.ngu.pattern.Utils.*;

public class Program3Originator {
	
	private String state;
	
	public Program3Memento createMemento() {
		return new Program3Memento(state);
	}
	
	public void setMementoState(Program3Memento memento) {
		state = memento.getState();
	}

	public void show() {
		println("state = " + state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
