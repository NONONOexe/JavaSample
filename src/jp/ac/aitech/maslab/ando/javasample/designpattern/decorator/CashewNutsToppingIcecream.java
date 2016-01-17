package jp.ac.aitech.maslab.ando.javasample.designpattern.decorator;

public class CashewNutsToppingIcecream implements Icecream {

	private Icecream ice = null;

	public CashewNutsToppingIcecream(Icecream ice) {
		this.ice = ice;
	}

	@Override
	public String getName() {
		String name = "カシューナッツ";
		name += ice.getName();
		return name;
	}

	@Override
	public String howSweet() {
		return ice.getName();
	}

}
