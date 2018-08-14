package roadgraph;

import java.util.Comparator;

public class NodeComparator implements Comparator<MapNode>{
	public int compare(MapNode x, MapNode y) {
		if(x.distanceToCurrent < y.distanceToCurrent) {
			return -1;
		}else if(x.distanceToCurrent == y.distanceToCurrent){
			return 0;
		}else {
			return -1;
		}
	}
}
