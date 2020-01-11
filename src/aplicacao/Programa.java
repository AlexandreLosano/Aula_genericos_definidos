package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidade.Produto;
import servico.Calculo;

public class Programa {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}

			Produto x = Calculo.max(lista);
			System.out.println("Max:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}