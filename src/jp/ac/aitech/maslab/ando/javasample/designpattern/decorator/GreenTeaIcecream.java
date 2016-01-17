package jp.ac.aitech.maslab.ando.javasample.designpattern.decorator;

public class GreenTeaIcecream implements Icecream {

	@Override
	public String getName() {
		return "抹茶アイスクリーム";
	}

	@Override
	public String howSweet() {
		return "抹茶味";
	}

}
