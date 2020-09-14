package br.edu.univas.gamingplatforms;

import br.edu.univas.factory.FactoryInterface;

public class GOG implements FactoryInterface {

	@Override
	public void connect() {
		System.out.println("Connected to GOG");
	}
}
