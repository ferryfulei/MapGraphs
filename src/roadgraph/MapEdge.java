package roadgraph;

import geography.GeographicPoint;

public class MapEdge {
	GeographicPoint start;
	GeographicPoint end;
	String streetName;
	Double distance;
	String streetType;
	MapEdge(GeographicPoint start, GeographicPoint end, String streetName, String steetType, Double distance){
		this.start = start;
		this.end = end;
		this.streetName = streetName;
		this.distance = distance;
		this.streetType = streetType;
	}
}
