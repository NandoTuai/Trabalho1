	//Pacote
package SuperClasse;

	//classe base chamada Polígono
public class Poligono {
	
	//variável de membro encapsulada
	protected double comprimentoLateral;
	
	//metodo construtor de um parâmetro
	public Poligono(double comprimentoLateral) {
		this.comprimentoLateral = comprimentoLateral;}
	
	//método int numeroDeLados () 
	public int numeroDeLados () {return 0;}
	
	//método double area ()
	public double area () {return 0;}
}
