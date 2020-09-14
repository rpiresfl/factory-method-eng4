package br.edu.univas.gamingplatforms;

import br.edu.univas.factory.FactoryInterface;

public class PSN implements FactoryInterface {

	@Override
	public void connect() {
		System.out.println("Connected to PSN");
	}
}
