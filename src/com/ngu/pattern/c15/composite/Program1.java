package com.ngu.pattern.c15.composite;

/**
 * 需求：描述集团公司，公司结构：总公司-子公司-附属公司，且每个公司下都有若干个部门
 * 
 * Program1：
 * Company 总公司，即："树根"
 * ConcreteCompany 子公司，即："分支节点"
 * XXDepartment 公司部门，如 hr 部门：HRDepartment，即："叶子节点"，叶子节点下没有分支了
 * 
 * Program2：组合模式 Component、Composite、Leaf，分别对应上面的 Company、ConcreteCompany、XXDepartment
 */
public class Program1 {

	public static void main(String[] args) {
		Program1Company company = new Program1ConcreteCompany("Head Office");
		company.add(new Program1HRDepartment("Head Office HR Department"));
		company.add(new Program1FinanceDepartment("Head Office Finance Department"));
		
		Program1Company subCompany1 = new Program1ConcreteCompany("Sub Company 1");
		subCompany1.add(new Program1HRDepartment("Sub Company 1 HR Department"));
		subCompany1.add(new Program1FinanceDepartment("Sub Company 1 Finance Department"));
		company.add(subCompany1);
		
		Program1Company microCompany1 = new Program1ConcreteCompany("Micro Company 1");
		microCompany1.add(new Program1HRDepartment("Micro Company 1 HR Department"));
		microCompany1.add(new Program1FinanceDepartment("Micro Company 1 Finance Department"));
		subCompany1.add(microCompany1);
		
		Program1Company microCompany2 = new Program1ConcreteCompany("Micro Company 2");
		microCompany2.add(new Program1HRDepartment("Micro Company 2 HR Department"));
		microCompany2.add(new Program1FinanceDepartment("Micro Company 2 Finance Department"));
		subCompany1.add(microCompany2);
		
		company.diaplay(0);
		company.execute();
	}
	
}
