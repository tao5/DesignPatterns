package com.ngu.pattern.c14.memento;
import static com.ngu.pattern.Utils.*;

/**
 * 需求：保存游戏进度
 * 
 * Program1：GameRole 角色类，有生命值、攻击力、防御力等属性。另外，内部还提供对角色状态的处理：初始化状态、显示状态、战斗
 * Program2：StateMemento 角色状态备忘(存储)类，用于存储角色的状态，即将角色类，有生命值、攻击力、防御力等属性独立成一个对象，便于管理这些状态。
 * StateManager 角色状态管理类，用于管理 StateMemento 对象是创建。
 * Program3：Originator 负责创建备忘录 Memento，并记录当前时刻它内部的状态，另外还可以根据备忘录恢复状态；
 * Memento 负责存储 Originator 对象的内部状态（这里只有一个状态：state）；
 * MementoManager 备忘录管理者，负责保存或设置备忘录。
 */
public class Program1 {
	
	public static void main(String[] args) {		
		// 初始化 role
		Program1GameRole originRole = new Program1GameRole();
		println("-----init-----");
		originRole.initRole();
		originRole.showState();
		// 备份 role
		Program1GameRole backupRole = new Program1GameRole();
		backupRole.setVitality(originRole.getVitality());
		backupRole.setAttack(originRole.getAttack());
		backupRole.setDefense(originRole.getDefense());
		// 战斗
		println("-----fight-----");
		originRole.fight();
		originRole.showState();
		// 借助备份恢复至战斗前的状态
		println("-----recovery-----");
		originRole.setVitality(backupRole.getVitality());
		originRole.setAttack(backupRole.getAttack());
		originRole.setDefense(backupRole.getDefense());
		originRole.showState();
	}

}
