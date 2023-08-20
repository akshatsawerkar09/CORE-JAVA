package com.app.org;

public class Mgr extends Emp {

	/*
	 * 3.2 Mgr state ---id,name,basic,deptId , perfBonus Behaviour ----1. get mgr
	 * details : override toString. 2. compute net salary (formula: basic+perfBonus)
	 * -- override computeNetSalary 3. get performance bonus. --add a new method to
	 * return bonus.(getter)
	 */

	private double perfBonus;

	public Mgr(int id, String name, String deptId, double basic, double perfBonus) {
		super(id, name, deptId, basic);
		this.perfBonus = perfBonus;
	}

	@Override
	public double computeNetSalary() {
		return getBasic() + perfBonus;
	}

	public double getPerfBonus() {
		return perfBonus;
	}

	@Override
	public String toString() {
		return super.toString() + ", perfBonus=" + perfBonus;
	}

}
