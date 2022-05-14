package Ex1;

//Classe "Filha", especializada, que herda tudo da classe abstrata "M�e" Personagem
public class Mago extends Personagem {

	// Atributos �nicos
	public double mana;
	
	// Get e Set
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	
	public Mago(String nome, double vida, double dano, int velocidade, double mana) {
		this.nome = nome;
		this.vida = vida;
		this.dano = dano;
		this.velocidade = velocidade;
		this.mana = mana;
	}
	
	// Magia do mago, ignora defesas, SOBRESCREVE o m�todo Ataque do Personagem, usando o mesmo nome e par�metros (Polimorfismo)
	@Override
	public void Ataque(Personagem df) {
		mana -= 50;
		double vidaAtual = df.getVida();
		double vidaRest = vidaAtual - dano;
		
		df.setVida(vidaRest);
	}
	
	// M�todo que SOBRESCREVE status de Personagem, usando o mesmo nome e par�metros (Polimorfismo)
	@Override
	public void Status() {
		System.out.println("Nome: " + nome
							+"\nVida: " + vida
							+"\nMana: " + mana + "\n");
	}
	
}
