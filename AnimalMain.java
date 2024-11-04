package Animal;
public class AnimalMain {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.setVivo(true);
		Cachorro dog = new Cachorro();
		dog.setLeite(true);
		dog.setPelangem("escura");
		dog.setSexo("feminino");
		dog.setTipoFocinho("claro");
		dog.setTipoPelagem("grossa");
		Gato gt = new Gato();
		gt.setGarrasRetráteis(12);
		Reptil rep = new Reptil();
		rep.setEctotermia(true);
	}
}
