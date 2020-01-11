package entidade;

public class Produto implements Comparable<Produto>{

	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return preco;
	}

	public void setPrice(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}

	@Override
	public int compareTo(Produto outro) {
		return preco.compareTo(outro.getPrice());
	}	
}
