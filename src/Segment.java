public class Segment {

	VectorInterface start;
	VectorInterface end;
	
	public Segment(VectorInterface start, VectorInterface end) {
		this.start = start;
		this.end = end;
	}
	
	public VectorInterface getStart() {
		return this.start;
	};
	public VectorInterface getEnd() {
		return this.end;
	};
	
	public double len() {
		var vectorFromSegment = this.getStart().sub(this.getEnd());
		return vectorFromSegment.len();
	};
	
	public double distanceTo(VectorInterface point) {
		var vectorStartToPoint = this.getStart().sub(point);
		var vectorEndToPoint = this.getEnd().sub(point);
		var vectorFromSegment = this.getStart().sub(this.getEnd());
		var cosAngleOfStart = vectorFromSegment.scalar(vectorStartToPoint) / (vectorFromSegment.len() * vectorStartToPoint.len());
		var cosAngleOfEnd = vectorFromSegment.multiply(-1).scalar(vectorEndToPoint) / (vectorFromSegment.len() * vectorEndToPoint.len());
		if (cosAngleOfStart <= 0 || cosAngleOfEnd <= 0) {
			return Math.min(vectorStartToPoint.len(), vectorEndToPoint.len());
		}
		var sinBetweenSides = Math.sqrt(1 - Math.pow(cosAngleOfStart, 2));
		return sinBetweenSides * vectorStartToPoint.len();
	};
	
}