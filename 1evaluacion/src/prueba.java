
public class prueba {
	public static void main(String[] args) {
		caballo pegaso;
		pegaso = new caballo();
		pegaso.setPeso(120);
		pegaso.setDueño("Jordi");
		System.out.println(pegaso.getPeso());
		System.out.println(pegaso.getDueño());
		System.out.println("Pegaso" + pegaso.correr());
		System.out.println("Pegaso" + pegaso.saltar());
		System.out.println("Pegaso" + pegaso.relinchar());
		
		caballo firulais;
		firulais = new caballo();
		firulais.setPeso(100);
		System.out.println(firulais.getPeso());
		System.out.println(pegaso.getPeso());
	}
}
