package servico;

import java.util.List;

public class Calculo {

	public static <Juquinha extends Comparable <Juquinha>> Juquinha max(List<Juquinha> lista) { //os nomes tocos são para enfatizar que pode ser qualquer coisa

		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar fazia");
		}
		Juquinha max = lista.get(0);
		for (Juquinha item : lista) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
