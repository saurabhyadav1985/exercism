import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Matrix {

	List<List<Integer>> values;
	List<Integer> maxRowValue;
	List<Integer> maxColumnValue;

	Matrix(List<List<Integer>> values) {
		this.values = values;
		this.maxRowValue = new ArrayList<>();
		this.maxColumnValue = new ArrayList<>();
		calculateMaxValues();
	}

	private void calculateMaxValues() {
		for (int index = 0; index < values.size(); index++) {
			maxRowValue.add(Collections.max(values.get(index)));
			int max = 0;
			for (int innerIndex = 0; innerIndex < values.get(0).size(); innerIndex++) {
				if (max < values.get(index).get(innerIndex)) {
					max = values.get(index).get(innerIndex);
				}
			}
			maxColumnValue.add(max);
		}
	}

	Set<MatrixCoordinate> getSaddlePoints() {
		Set<MatrixCoordinate> coordinates = new HashSet<>();
		for(int outerIndex =0; outerIndex < values.size(); outerIndex++) {
			for(int innerIndex =0; innerIndex < values.get(0).size(); innerIndex++) {
				int current = values.get(outerIndex).get(innerIndex);
				if(current == maxRowValue.get(outerIndex) && current == maxColumnValue.get(innerIndex)) {
					coordinates.add(new MatrixCoordinate(outerIndex, innerIndex));
				}
			}
		}
		return coordinates;
	}

}
