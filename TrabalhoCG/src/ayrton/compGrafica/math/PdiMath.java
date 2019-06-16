package ayrton.compGrafica.math;

import ayrton.compGrafica.model.Ponto3D;

public class PdiMath {

	public static double[][] multiplicacaoMatriz(double[][] a, double[][] b) {
		// linha por coluna

		if (a == null || b == null)
			throw new NullPointerException("Argumentos nulos");

		if (a[0].length != b.length)
			throw new IllegalArgumentException("Numero de linhas de \"A\" � diferente de colunas de \"B\"");

		final double[][] resultado = new double[a.length][b[0].length];

		for (int x = 0; x < resultado.length; x++)
			for (int y = 0; y < resultado[0].length; y++) {

				double acomulador = 0;
				for (int i = 0; i < a[0].length; i++)
					acomulador += a[x][i] * b[i][y];

				resultado[x][y] = acomulador;
			}

		return resultado;
	}

	public static Ponto3D[] bezierCurve(Ponto3D[] controle, int numeroPontos) {
		double passo = 1.0 / numeroPontos;
		Ponto3D[] pontos = new Ponto3D[numeroPontos];
		double xu = 0.0, yu = 0.0, zu = 0.0, u = 0.0;

		int i = 0;
		for (u = 0.0; u < 1.0; u += passo) {
			xu = Math.pow(1.0 - u, 3.0) * controle[0].x + 3.0 * u * Math.pow(1.0 - u, 2.0) * controle[1].x
					+ 3.0 * Math.pow(u, 2.0) * (1.0 - u) * controle[2].x + Math.pow(u, 3.0) * controle[3].x;

			yu = Math.pow(1.0 - u, 3.0) * controle[0].y + 3.0 * u * Math.pow(1.0 - u, 2.0) * controle[1].y
					+ 3.0 * Math.pow(u, 2.0) * (1.0 - u) * controle[2].y + Math.pow(u, 3.0) * controle[3].y;

			zu = Math.pow(1.0 - u, 3.0) * controle[0].z + 3.0 * u * Math.pow(1.0 - u, 2.0) * controle[1].z
					+ 3.0 * Math.pow(u, 2.0) * (1.0 - u) * controle[2].z + Math.pow(u, 3.0) * controle[3].z;

			pontos[i++] = new Ponto3D(xu, yu, zu);
		}

		return pontos;
	}
}
