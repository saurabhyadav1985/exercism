import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

	List<List<Integer>> values;
	List<Integer> maxRowValue;
	List<Integer> minColumnValue;

	Matrix(List<List<Integer>> values) {
		this.values = values;
		this.maxRowValue = new ArrayList<>();
		this.minColumnValue = new ArrayList<>();
		calculateMaxValues();
	}

	private void calculateMaxValues() {
		for (int index = 0; index < values.size(); index++) {
			maxRowValue.add(Collections.max(values.get(index)));
			int min = Integer.MAX_VALUE;
			for (int innerIndex = 0; innerIndex < values.get(0).size(); innerIndex++) {
				if (values.get(innerIndex).get(index) < min) {
					min = values.get(innerIndex).get(index);
				}
			}
			minColumnValue.add(min);
		}
	}

	Set<MatrixCoordinate> getSaddlePoints() {
		System.out.println("Values " + values);
		System.out.println("Row Max " + maxRowValue);
		System.out.println("Column Max " + minColumnValue);
		Set<MatrixCoordinate> coordinates = new HashSet<>();
		for(int outerIndex =0; outerIndex < values.size(); outerIndex++) {
			for(int innerIndex =0; innerIndex < values.get(0).size(); innerIndex++) {

				int current = values.get(innerIndex).get(outerIndex);
				
				System.out.println(outerIndex + "," + innerIndex + " = " + current);
				
				if(current == maxRowValue.get(outerIndex) && current == minColumnValue.get(innerIndex)) {
					coordinates.add(new MatrixCoordinate(innerIndex + 1, outerIndex+1));
				}
			}
		}
		return coordinates;
	}

}
