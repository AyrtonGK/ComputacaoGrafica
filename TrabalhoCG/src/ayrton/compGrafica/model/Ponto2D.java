package ayrton.compGrafica.model;

public class Ponto2D {
	public int x;
	public int y;

	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
