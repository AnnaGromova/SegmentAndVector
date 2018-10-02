public class Vector3D extends AbstractVector {
	
	public Vector3D(double[] vector) {
		super(vector);
		this.vector = new double[this.dimension()];
		System.arraycopy(vector, 0, this.vector, 0, this.dimension());
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
	
	public int dimension() {
		return 3;
	}

	public VectorInterface multiply(double factor) {
		double[] newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) { ;
			newVectorAsArray[i] = this.getComponent(i) * factor;
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	public VectorInterface add(VectorInterface v) {
		var newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) {
			newVectorAsArray[i] = this.getComponent(i) + v.getComponent(i);
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	public VectorInterface sub(VectorInterface v) {
		var newVectorAsArray = new double[this.dimension()];
		for (int i = 0; i < this.dimension(); i++) {
			newVectorAsArray[i] = this.getComponent(i) - v.getComponent(i);
		}
		var newVector = new Vector3D(newVectorAsArray);
		return newVector;
	}

	
}
