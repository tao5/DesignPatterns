package com.ngu.pattern.c14.memento;
import static com.ngu.pattern.Utils.*;

public class Program2 {
	
	public static void main(String[] args) {		
		// 初始化 role
		Program2GameRole originRole = new Program2GameRole();
		println("-----init-----");
		originRole.initRole();
		originRole.showState();
		// 备份 role
		Program2StateMementoManager stateManager = new Program2StateMementoManager();
		stateManager.setMemento(originRole.saveState());
		// 战斗
		println("-----fight-----");
		originRole.fight();
		originRole.showState();
		// 借助备份恢复至战斗前的状态
		println("-----recovery-----");
		originRole.recoveryState(stateManager.getMemento());
		originRole.showState();
	}

}
