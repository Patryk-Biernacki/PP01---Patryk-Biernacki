import java.util.ArrayList;
import java.util.Random;

class WinnerWasCalled extends Exception {
}

class Log {

	public static void info() {
		System.out.println("");
	}

	public static void info(String message) {
		System.out.println(message);
	}

}

class Dice {

	private int sciany;

	public Dice(int liczba) {
		sciany = liczba;
	}

	public int roll() {
		Random rand = new Random();
		int result = rand.nextInt(6) + 1;

		Log.info("Dice roll: " + result);
		return result;
	}

}

class Pawn {

	private int position;
	private String name;

	public Pawn(String name) {
		this.position = 0;
		this.name = name;
		
		Log.info(this.name + " joined the game.");
	}

	public int pozycja() {
		return position;
	}

	public String nazwa() {
		return name;
	}

	public void nowaPozycja(int rollResult) {
		position += rollResult;
	}

}

class Board {

	private int max_position = 100;

	private ArrayList<Pawn> pawns;
	private Dice dice;
	protected Pawn winner;
	private int turnsCounter;
	private int liczbaRuchow;

	public Board(int pola, Dice kostka, int ruchy, ArrayList<Pawn> pionki) {
		this.pawns = pionki;
		this.dice = kostka;
		this.winner = pawns.get(0);
		this.turnsCounter = 0;
		this.max_position = pola;
		this.liczbaRuchow = ruchy;
	}

	public void performTurn() throws WinnerWasCalled {
		this.turnsCounter++;
		Log.info();
		Log.info("Turn " + this.turnsCounter);

		for(Pawn pawn : this.pawns) {
			int rollResult = this.dice.roll();
			pawn.nowaPozycja(rollResult);
			Log.info(pawn.nazwa() + " new position: " + pawn.pozycja());
			
			if(pawn.pozycja() >= this.max_position) {
				this.winner = pawn;
				throw new WinnerWasCalled();
			}
		}
	}

}

public class Main {

	public static void main(String[] args) {

		ArrayList<Pawn> pionki = new ArrayList<>();
		for(int i=0; i<iloscGraczy(); i++) {
			pionki.add(new Pawn("Luke Skywalker"+i));
			pionki.add(new Pawn("Darth Vader"+i));
		}

		Dice kostka = new Dice(6);
		Board board = new Board(100, kostka, 10, pionki);

		try {
			while(true) {
				board.performTurn();
			}
		} catch(WinnerWasCalled exception) {
			Log.info();
			Log.info(board.winner.nazwa() + " won.");
		}
	}

	public static int iloscGraczy() {
		Random rand = new Random();
		int n = rand.nextInt(10)+3;
		return n;
	}

}
