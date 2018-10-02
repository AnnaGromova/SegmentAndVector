import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTests {

	@Test
	void testVector3DAdd() {
		VectorInterface firstVector = new Vector3D(new double[] { 1, 2, 3});
		VectorInterface secondVector = new Vector3D(new double[] { 4, 5, 2});
		VectorInterface expectedVector = new Vector3D(new double[] { 5, 7, 5});
		Assert.assertEquals(expectedVector, firstVector.add(secondVector));
	}
	
	@Test
	void testVector3DSub() {
		VectorInterface firstVector = new Vector3D(new double[] { 1, 2, 3});
		VectorInterface secondVector = new Vector3D(new double[] { 4, 5, 2});
		VectorInterface expectedVector = new Vector3D(new double[] { -3, -3, 1});
		Assert.assertEquals(expectedVector, firstVector.sub(secondVector));
	}
	
	@Test
	void testVector3DDimension() {
		VectorInterface vector = new Vector3D(new double[] { 1, 2, 3});
		int expectedDimension = 3;
		Assert.assertEquals(expectedDimension, vector.dimension());
	}

	@Test
	void testVector3DComponents() {
		VectorInterface vector = new Vector3D(new double[] { 1, 2, 3});
		double expectedComponent = 1.0;
		Assert.assertEquals(expectedComponent, vector.getComponent(0), 0.0000001);
	}

	@Test
	void testVector3DMultiply() {
		VectorInterface vector = new Vector3D(new double[] { 1, 2, -3});
		VectorInterface expectedVector = new Vector3D(new double[] { 3, 6, -9});
		Assert.assertEquals(expectedVector, vector.multiply(3));
	}
	
	@Test
	void testVector3DScalar() {
		VectorInterface firstVector = new Vector3D(new double[] { 1, 2, -3});
		VectorInterface secondVector = new Vector3D(new double[] { 2, 5, 1});
		double expectedVector = 9;
		Assert.assertEquals(expectedVector, firstVector.scalar(secondVector), 0.0000001);
	}
	
	@Test
	void testVector2DAdd() {
		VectorInterface firstVector = new Vector2D(new double[] { 1, 2 });
		VectorInterface secondVector = new Vector2D(new double[] { 5, 2 });
		VectorInterface expectedVector = new Vector2D(new double[] { 6, 4 });
		Assert.assertEquals(expectedVector, firstVector.add(secondVector));
	}
	
	@Test
	void testVector2DSub() {
		VectorInterface firstVector = new Vector2D(new double[] { 2, 3 });
		VectorInterface secondVector = new Vector2D(new double[] { 4, 5 });
		VectorInterface expectedVector = new Vector2D(new double[] { -2, -2 });
		Assert.assertEquals(expectedVector, firstVector.sub(secondVector));
	}
	
	@Test
	void testVector2DDimension() {
		VectorInterface vector = new Vector2D(new double[] { 5, 6 });
		int expectedDimension = 2;
		Assert.assertEquals(expectedDimension, vector.dimension());
	}

	@Test
	void testVector2DComponents() {
		VectorInterface vector = new Vector2D(new double[] { 2, 3 });
		var expectedComponent = 2;
		Assert.assertEquals(expectedComponent, vector.getComponent(0), 0.0000001);
	}
	
	@Test
	void testVector2DMultiply() {
		VectorInterface vector = new Vector2D(new double[] { 1, -4 });
		VectorInterface expectedVector = new Vector2D(new double[] { 3, -12});
		Assert.assertEquals(expectedVector, vector.multiply(3));
	}

	@Test
	void testVector2DScalar() {
		VectorInterface firstVector = new Vector2D(new double[] { 4, -1});
		VectorInterface secondVector = new Vector2D(new double[] { 2, 5});
		double expectedVector = 3;
		Assert.assertEquals(expectedVector, firstVector.scalar(secondVector), 0.0000001);
	}
}
