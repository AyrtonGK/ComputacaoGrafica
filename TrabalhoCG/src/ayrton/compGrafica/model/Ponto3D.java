package ayrton.compGrafica.model;

public class Ponto3D {

	public double x;
	public double y;
	public double z;

	public Ponto3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double distancia(Ponto3D outro) {

		double dx = this.x - outro.x;
		double dy = this.y - outro.y;
		double dz = this.z - outro.z;
		
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}
}
