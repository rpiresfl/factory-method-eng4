package br.edu.univas.factory;

import br.edu.univas.gamingplatforms.EpicGames;
import br.edu.univas.gamingplatforms.GOG;
import br.edu.univas.gamingplatforms.Origin;
import br.edu.univas.gamingplatforms.PSN;
import br.edu.univas.gamingplatforms.Steam;
import br.edu.univas.gamingplatforms.XboxLive;

public class FactoryCreator {
	public static final int epicGames = 1;
	public static final int gog = 2;
	public static final int origin = 3;
	public static final int psn = 4;
	public static final int steam = 5;
	public static final int xboxLive = 6;
	
	public FactoryCreator() {}
	
	public static FactoryInterface getGamingPlatform(int platform) {
		switch(platform) {
			case epicGames: return new EpicGames();
			case gog: return new GOG();
			case origin: return new Origin();
			case psn: return new PSN();
			case steam: return new Steam();
			case xboxLive: return new XboxLive();
			default: return null;
		}
	}
}
