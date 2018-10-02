import java.util.Arrays;

public abstract class AbstractVector implements VectorInterface{

	public double[] vector;
	
	public AbstractVector(double[] newVectorAsArray) {
		this.vector = new double[this.dimension()];
		System.arraycopy(vector, 0, this.vector, 0, this.dimension());
	}

	@Override
	abstract public int dimension();

	@Override
	public double getComponent(int i) {
		return this.vector[i];
	}

	@Override
	public double scalar(VectorInterface anotherVector) {
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
	abstract public VectorInterface multiply(double factor);

	@Override
	abstract public VectorInterface add(VectorInterface v);

	@Override
	abstract public VectorInterface sub(VectorInterface v);

	@Override
	public double[] printVector() {
		var copyVector = new double[this.dimension()];
		System.arraycopy(this.vector, 0, copyVector, 0, this.dimension());
		return copyVector;
	}
	
	@Override
	public boolean equals(Object v) {
		if (Arrays.equals(((VectorInterface) v).printVector(), this.printVector()))
			return true;
		return false;
	}
	
}
