import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

	List<List<Integer>> values;
	List<Integer> maxRowValue;
	List<Integer> maxColumnValue;

	Matrix(List<List<Integer>> values) {
		
		this.values = values;
		this.maxRowValue = new ArrayList<>();
		this.maxColumnValue = new ArrayList<>();
		System.out.println("Values " + values);
		calculateMaxValues();
	}

	private void calculateMaxValues() {
		for (int index = 0; index < values.size(); index++) {
			maxRowValue.add(Collections.max(values.get(index)));
			int max = 0;
			for (int innerIndex = 0; innerIndex < values.get(0).size(); innerIndex++) {
				System.out.println("Max " + max + " current column " + values.get(innerIndex).get(index));
				if (max < values.get(innerIndex).get(index)) {
					max = values.get(innerIndex).get(index);
				}
			}
			maxColumnValue.add(max);
		}
		System.out.println("Row Max " + maxRowValue);
		System.out.println("Column Max " + maxColumnValue);

	}

	Set<MatrixCoordinate> getSaddlePoints() {
		Set<MatrixCoordinate> coordinates = new HashSet<>();
		for(int outerIndex =0; outerIndex < values.size(); outerIndex++) {
			for(int innerIndex =0; innerIndex < values.get(0).size(); innerIndex++) {
				System.out.println(outerIndex + " " + innerIndex);
				int current = values.get(innerIndex).get(outerIndex);
				if(current == maxRowValue.get(outerIndex) && current == maxColumnValue.get(innerIndex)) {
					coordinates.add(new MatrixCoordinate(innerIndex+1, outerIndex+1));
				}
			}
		}
		return coordinates;
	}

}
