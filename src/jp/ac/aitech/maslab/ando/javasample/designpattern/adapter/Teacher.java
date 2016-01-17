package jp.ac.aitech.maslab.ando.javasample.designpattern.adapter;

public class Teacher {

	public static void main(String[] args) {
		ChairPerson chairPerson = new NewTaro();
		chairPerson.organizeClass();
	}

}
