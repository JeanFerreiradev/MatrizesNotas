
public class Main4 {
	static final double[][] notas = { 
			{ 14.00, 20.00, 35.00, 0.00 }, 
			{ 27.00, 25.00, 38.00, 0.00 },
			{ 10.00, 5.00, 30.00, 0.00 } 
	};

	static void imprimirNotas() {

		System.out.println("\n");

		for (int i = 0; i < notas.length; i++) {

			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}

			System.out.println("\n");

		}

	}

	static int indiceMenorNota(int indiceAluno) {

		double menorNota = Double.MAX_VALUE;
		int indiceMenorNota = -1;

		for (int j = 0; j < (notas[indiceAluno].length - 1); j++) {

			if (notas[indiceAluno][j] < menorNota) {
				menorNota = notas[indiceAluno][j];
				indiceMenorNota = j;
			}

		}

		return indiceMenorNota;
	}

	static double menorNotaAluno(int indiceAluno) {

		double menorNota = Double.MAX_VALUE;

		for (int j = 0; j < (notas[indiceAluno].length - 1); j++) {

			if (notas[indiceAluno][j] < menorNota) {
				menorNota = notas[indiceAluno][j];
			}

		}

		return menorNota;
	}

	static double calcularMediaAluno(int indiceAluno) {
		return somarNotasAluno(indiceAluno) / (notas[indiceAluno].length - 1);
	}

	static double somarNotasAluno(int indiceAluno) {

		double totalNotas = 0.0;

		for (int j = 0; j < (notas[indiceAluno].length - 1); j++) {

			totalNotas += notas[indiceAluno][j];
		}

		return totalNotas;
	}

	static void atualizarNotaAI(int indiceAluno, double nota) {
		int indiceNotaAI = notas[indiceAluno].length - 1;
		notas[indiceAluno][indiceNotaAI] = nota;
	}

	static void substituirNotas(int indiceAlunos) {

		int indiceNotaAI = notas[indiceAlunos].length - 1;
		double notaAvaliacaoAI = notas[indiceAlunos][indiceNotaAI];

		if (notas[indiceAlunos][0] <= notas[indiceAlunos][1]) {

			if (notaAvaliacaoAI > notas[indiceAlunos][0])
				notas[indiceAlunos][0] = notaAvaliacaoAI;

		} else {

			if (notaAvaliacaoAI > notas[indiceAlunos][1])
				notas[indiceAlunos][1] = notaAvaliacaoAI;
		}

	}

	public static void main(String[] args) {
		imprimirNotas();

		int indice = indiceMenorNota(0);
		double menorNota = menorNotaAluno(1);

		System.out.println(indice);
		System.out.println(menorNota);
		System.out.println("Nota Final = " + somarNotasAluno(0));

		atualizarNotaAI(0, 3);
		substituirNotas(0);

		imprimirNotas();
	}

}
