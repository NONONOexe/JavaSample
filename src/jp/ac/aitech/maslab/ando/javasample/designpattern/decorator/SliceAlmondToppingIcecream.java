package jp.ac.aitech.maslab.ando.javasample.designpattern.decorator;

public class SliceAlmondToppingIcecream implements Icecream {

	Icecream ice = null;

	public SliceAlmondToppingIcecream(Icecream ice) {
		this.ice = ice;
	}

	@Override
	public String getName() {
		String name = "スライスアーモンド";
		name += ice.getName();
		return name;
	}

	@Override
	public String howSweet() {
		return ice.howSweet();
	}

}
