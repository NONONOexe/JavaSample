package jp.ac.aitech.maslab.ando.javasample.designpattern.decorator;

public class VanillaIcecream implements Icecream {

	@Override
	public String getName() {
		return "バニラアイスクリーム";
	}

	@Override
	public String howSweet() {
		return "バニラ味";
	}
}
