package br.edu.univas.main;

import br.edu.univas.factory.FactoryCreator;
import br.edu.univas.factory.FactoryInterface;

public class StartApp {
	
	public static void main(String[] args) {		
		FactoryInterface factory = FactoryCreator.getGamingPlatform(FactoryCreator.epicGames);
		factory.connect();
		
		factory = FactoryCreator.getGamingPlatform(FactoryCreator.gog);
		factory.connect();
		
		factory = FactoryCreator.getGamingPlatform(FactoryCreator.origin);
		factory.connect();
		
		factory = FactoryCreator.getGamingPlatform(FactoryCreator.psn);
		factory.connect();
		
		factory = FactoryCreator.getGamingPlatform(FactoryCreator.steam);
		factory.connect();
		
		factory = FactoryCreator.getGamingPlatform(FactoryCreator.xboxLive);
		factory.connect();
	}
}
