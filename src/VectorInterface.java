interface VectorInterface {
	
	int dimension();
	 
	double getComponent(int i);
	
	double scalar(VectorInterface v);
	
	double len();
	
	VectorInterface multiply(double factor);
	
	VectorInterface add(VectorInterface v);
	
	VectorInterface sub(VectorInterface v);

	double[] printVector();
}
