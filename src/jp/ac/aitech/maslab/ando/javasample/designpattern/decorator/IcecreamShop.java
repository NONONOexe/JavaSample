package jp.ac.aitech.maslab.ando.javasample.designpattern.decorator;

public class IcecreamShop {

	public static void main(String[] args) {
		Icecream ice1 = new VanillaIcecream();
		Icecream ice2 = new CashewNutsToppingIcecream(new GreenTeaIcecream());
		Icecream ice3 = new SliceAlmondToppingIcecream(new CashewNutsToppingIcecream(new VanillaIcecream()));

		System.out.println(ice1.getName());
		System.out.println(ice2.getName());
		System.out.println(ice3.getName());
	}

}
