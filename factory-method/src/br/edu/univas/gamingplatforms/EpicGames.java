package br.edu.univas.gamingplatforms;

import br.edu.univas.factory.FactoryInterface;

public class EpicGames implements FactoryInterface {

	@Override
	public void connect() {
		System.out.println("Connected to EpicGames");
	}
}
