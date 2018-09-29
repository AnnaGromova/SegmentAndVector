interface Vector {
	
	int dimension();
	 
	double getComponent(int i);
	
	double scalar(Vector v);
	
	double len();
	
	Vector multiply(double factor);
	
	Vector add(Vector v);
	
	Vector sub(Vector v);

	double[] printVector();
}
