	//Pacote
package SuperClasse;

	//classe base chamada Pol�gono
public class Poligono {
	
	//vari�vel de membro encapsulada
	protected double comprimentoLateral;
	
	//metodo construtor de um par�metro
	public Poligono(double comprimentoLateral) {
		this.comprimentoLateral = comprimentoLateral;}
	
	//m�todo int numeroDeLados () 
	public int numeroDeLados () {return 0;}
	
	//m�todo double area ()
	public double area () {return 0;}
}
