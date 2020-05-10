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
		System.out.println("Col Min " + minColumnValue);
		Set<MatrixCoordinate> coordinates = new HashSet<>();
		for(int rowIndex =0; rowIndex < values.size(); rowIndex++) {
			for(int columnIndex =0; columnIndex < values.get(0).size(); columnIndex++) {

				int current = values.get(rowIndex).get(columnIndex);
				
				System.out.println(rowIndex + "," + columnIndex + " = " + current);
				
				if(current == maxRowValue.get(rowIndex) && current == minColumnValue.get(columnIndex)) {
					System.out.println("Condition satisfied for " + current);
					coordinates.add(new MatrixCoordinate(rowIndex + 1, columnIndex+1));
				}
			}
		}
		return coordinates;
	}

}
