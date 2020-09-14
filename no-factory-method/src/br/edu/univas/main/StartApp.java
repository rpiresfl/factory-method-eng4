package br.edu.univas.main;

import br.edu.univas.gamingplatforms.EpicGames;
import br.edu.univas.gamingplatforms.GOG;
import br.edu.univas.gamingplatforms.Origin;
import br.edu.univas.gamingplatforms.PSN;
import br.edu.univas.gamingplatforms.Steam;
import br.edu.univas.gamingplatforms.XboxLive;

public class StartApp {
	
	public static void main(String[] args) {	
		EpicGames epicGames = new EpicGames();
		GOG gog = new GOG();
		Origin origin = new Origin();
		PSN psn = new PSN();
		Steam steam = new Steam();
		XboxLive xboxLive = new XboxLive();
		
		epicGames.connect();
		gog.connect();
		origin.connect();
		psn.connect();
		steam.connect();
		xboxLive.connect();
	}
}
