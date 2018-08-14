package roadgraph;

import java.util.ArrayList;
import java.util.List;

import geography.GeographicPoint;

public class MapNode  {
	Double distanceToCurrent;
	Double distanceToGoal;
	List<MapEdge> edges;
	GeographicPoint vertice;
	MapNode(GeographicPoint e){
		vertice = e;
		edges = new ArrayList<MapEdge>();
		distanceToCurrent = (double) 0;
	}
	void addChildren(MapEdge e){
		edges.add(e);
	}
}
