class ResistorColor {
	int colorCode(String color) {
		Color required = Enum.valueOf(Color.class, color.toLowerCase());
		return required.ordinal();

	}

	String[] colors() {
		Color[] colors = Color.values();
		String[] colorsStrArray = new String[colors.length];
		for (int i = 0 ; i < colors.length; i++) {
			colorsStrArray[i] = colors[i].toString();
		}
		return colorsStrArray;
	}

	enum Color {
		black, brown, red, orange, yellow, green, blue, violet, grey, white;
	}
}
