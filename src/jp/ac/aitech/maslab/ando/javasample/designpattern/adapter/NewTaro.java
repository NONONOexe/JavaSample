package jp.ac.aitech.maslab.ando.javasample.designpattern.adapter;

public class NewTaro extends Taro implements ChairPerson {

	@Override
	public void organizeClass() {
		super.enjoyWithAllClassmate();
	}

}
