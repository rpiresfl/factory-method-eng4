package br.edu.univas.gamingplatforms;

import br.edu.univas.factory.FactoryInterface;

public class XboxLive implements FactoryInterface {
	
	@Override
	public void connect() {
		System.out.println("Connected to Xbox Live");
	}
}
