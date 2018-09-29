import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTests {

	@Test
	void testVector3DAdd() {
		Vector firstVector = new Vector3D(new double[] { 1, 2, 3});
		Vector secondVector = new Vector3D(new double[] { 4, 5, 2});
		Vector expectedVector = new Vector3D(new double[] { 5, 7, 5});
		Assert.assertEquals(expectedVector, firstVector.add(secondVector));
	}
	
	@Test
	void testVector3DSub() {
		Vector firstVector = new Vector3D(new double[] { 1, 2, 3});
		Vector secondVector = new Vector3D(new double[] { 4, 5, 2});
		Vector expectedVector = new Vector3D(new double[] { -3, -3, 1});
		Assert.assertEquals(expectedVector, firstVector.sub(secondVector));
	}
	
	@Test
	void testVector3DDimension() {
		Vector vector = new Vector3D(new double[] { 1, 2, 3});
		int expectedDimension = 3;
		Assert.assertEquals(expectedDimension, vector.dimension());
	}

	@Test
	void testVector3DComponents() {
		Vector vector = new Vector3D(new double[] { 1, 2, 3});
		double expectedComponent = 1.0;
		Assert.assertEquals(expectedComponent, vector.getComponent(0), 0.0000001);
	}

	@Test
	void testVector3DMultiply() {
		Vector vector = new Vector3D(new double[] { 1, 2, -3});
		Vector expectedVector = new Vector3D(new double[] { 3, 6, -9});
		Assert.assertEquals(expectedVector, vector.multiply(3));
	}
	
	@Test
	void testVector3DScalar() {
		Vector firstVector = new Vector3D(new double[] { 1, 2, -3});
		Vector secondVector = new Vector3D(new double[] { 2, 5, 1});
		double expectedVector = 9;
		Assert.assertEquals(expectedVector, firstVector.scalar(secondVector), 0.0000001);
	}
	
	@Test
	void testVector2DAdd() {
		Vector firstVector = new Vector2D(new double[] { 1, 2 });
		Vector secondVector = new Vector2D(new double[] { 5, 2 });
		Vector expectedVector = new Vector2D(new double[] { 6, 4 });
		Assert.assertEquals(expectedVector, firstVector.add(secondVector));
	}
	
	@Test
	void testVector2DSub() {
		Vector firstVector = new Vector2D(new double[] { 2, 3 });
		Vector secondVector = new Vector2D(new double[] { 4, 5 });
		Vector expectedVector = new Vector2D(new double[] { -2, -2 });
		Assert.assertEquals(expectedVector, firstVector.sub(secondVector));
	}
	
	@Test
	void testVector2DDimension() {
		Vector vector = new Vector2D(new double[] { 5, 6 });
		int expectedDimension = 2;
		Assert.assertEquals(expectedDimension, vector.dimension());
	}

	@Test
	void testVector2DComponents() {
		Vector vector = new Vector2D(new double[] { 2, 3 });
		var expectedComponent = 2;
		Assert.assertEquals(expectedComponent, vector.getComponent(0), 0.0000001);
	}
	
	@Test
	void testVector2DMultiply() {
		Vector vector = new Vector2D(new double[] { 1, -4 });
		Vector expectedVector = new Vector2D(new double[] { 3, -12});
		Assert.assertEquals(expectedVector, vector.multiply(3));
	}

	@Test
	void testVector2DScalar() {
		Vector firstVector = new Vector2D(new double[] { 4, -1});
		Vector secondVector = new Vector2D(new double[] { 2, 5});
		double expectedVector = 3;
		Assert.assertEquals(expectedVector, firstVector.scalar(secondVector), 0.0000001);
	}
}
