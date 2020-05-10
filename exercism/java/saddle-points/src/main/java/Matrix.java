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
		int rowSize = values.size();
		if(rowSize ==0) {
			return;
		}
		
		int columnSize = values.get(0).size();
		for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
			maxRowValue.add(Collections.max(values.get(rowIndex)));
		}

		for (int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
			int min = Integer.MAX_VALUE;
			for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
				if (values.get(rowIndex).get(columnIndex) < min) {
					min = values.get(rowIndex).get(columnIndex);
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
		for (int rowIndex = 0; rowIndex < values.size(); rowIndex++) {
			for (int columnIndex = 0; columnIndex < values.get(0).size(); columnIndex++) {

				int current = values.get(rowIndex).get(columnIndex);

				System.out.println(rowIndex + "," + columnIndex + " = " + current);

				if (current == maxRowValue.get(rowIndex) && current == minColumnValue.get(columnIndex)) {
					System.out.println("Condition satisfied for " + current);
					coordinates.add(new MatrixCoordinate(rowIndex + 1, columnIndex + 1));
				}
			}
		}
		return coordinates;
	}

}
