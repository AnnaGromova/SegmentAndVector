import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SegmentTests {

	@Test
	void testSegmentGetStart() {
		var segment = new Segment(new Vector2D(new double[] { 1, 2 }), new Vector2D(new double[] { 4, -2 }));
		Vector expectedStart = new Vector2D(new double[] { 1, 2 });
		Assert.assertEquals(expectedStart, segment.getStart());
	}
	
	@Test
	void testSegmentGetEnd() {
		var segment = new Segment(new Vector2D(new double[] { 1, 2 }), new Vector2D(new double[] { 4, -2 }));
		Vector expectedEnd = new Vector2D(new double[] { 4, -2 });
		Assert.assertEquals( expectedEnd, segment.getEnd());
	}

	@Test
	void testSegmentLen() {
		var segment = new Segment(new Vector2D(new double[] { 1, 2 }), new Vector2D(new double[] { 4, -2 }));
		var expectedLength = 5;
		Assert.assertEquals(expectedLength, segment.len(), 0.0000001);
	}
	
	@Test
	void testSegmentDistanceToFromHeight() {
		var segment = new Segment(new Vector2D(new double[] { 1, 2 }), new Vector2D(new double[] { 2, 1 }));
		var point = new Vector2D(new double[] { 2, 2 });
		var expected = Math.sqrt(2) / 2;
		Assert.assertEquals(expected, segment.distanceTo(point), 0.0000001);
	}
	
	@Test
	void testSegmentDistanceToFromPointToPoint() {
		var segment = new Segment(new Vector2D(new double[] { 1, 2 }), new Vector2D(new double[] { 2, 1 }));
		var point = new Vector2D(new double[] { 2, 0 });
		var expected = 1;
		Assert.assertEquals(expected, segment.distanceTo(point), 0.0000001);
	}
}
