package Animal;
public class Mamifero extends Animal{
	private boolean leite;
	private String pelangem;
	public boolean isLeite() {
		return leite;
	}
	public void setLeite(boolean leite) {
		this.leite = leite;
	}
	public String getPelangem() {
		return pelangem;
	}
	public void setPelangem(String pelangem) {
		this.pelangem = pelangem;
	}
	@Override
	public String toString() {
		return "Mamifero [leite=" + leite + ", pelangem=" + pelangem + "]";
	}
}
