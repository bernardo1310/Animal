package Animal;
public class Gato extends Mamifero{
	private int GarrasRetráteis;

	public int getGarrasRetráteis() {
		return GarrasRetráteis;
	}

	public void setGarrasRetráteis(int garrasRetráteis) {
		GarrasRetráteis = garrasRetráteis;
	}

	@Override
	public String toString() {
		return "Gato [GarrasRetráteis=" + GarrasRetráteis + "]";
	}
	
}
