import java.util.Arrays;

public class Vector3D implements Vector {

	private double[] vector;	
	
	public Vector3D(double[] vector) {
		this.vector = new double[3];
		System.arraycopy(vector, 0, this.vector, 0, 3);
	}
	
	public double getX() {
		return this.vector[0]; 
	}
	
	public double getY() {
		return this.vector[1]; 
	}
	
	public double getZ() {
		return this.vector[2]; 
	}
	
	@Override
	public int dimension() {
		return 3;
	}

	@Override
	public double getComponent(int i) {
		return this.vector[i];
	}

	@Override
	public double scalar(Vector anotherVector) {
		double scalar = 0;
		for (int i = 0; i < this.dimension(); i++) {
		scalar += this.getComponent(i) * anotherVector.getComponent(i);
		}
		return scalar;
	}

	@Override
	public double len() {
		double SquareOfLen = 0;
		for (double component : this.vector) {
			SquareOfLen += Math.pow(component, 2);
		}
		return Math.sqrt(SquareOfLen);
	}

	@Override
	public Vector multiply(double factor) {
		double[] newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) { ;
			newVectorAsArray[i] = this.getComponent(i) * factor;
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	@Override
	public Vector add(Vector v) {
		var newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) {
			newVectorAsArray[i] = this.getComponent(i) + v.getComponent(i);
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	@Override
	public Vector sub(Vector v) {
		var newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) {
			newVectorAsArray[i] = this.getComponent(i) - v.getComponent(i);
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	@Override
	public double[] printVector() {
		var copyVector = new double[this.dimension()];
		System.arraycopy(this.vector, 0, copyVector, 0, this.dimension());
		return copyVector;
	}
	
	@Override
	public boolean equals(Object v) {
		if (Arrays.equals(((Vector) v).printVector(), this.printVector()))
			return true;
		return false;
	}
}
