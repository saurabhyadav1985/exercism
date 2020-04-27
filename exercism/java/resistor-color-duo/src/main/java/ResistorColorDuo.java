class ResistorColorDuo {
	int value(String[] colors) {
		Color firstEnum = Enum.valueOf(Color.class, colors[0].toUpperCase());
		Color secondEnum = Enum.valueOf(Color.class, colors[1].toUpperCase());
		return firstEnum.ordinal() * 10 + secondEnum.ordinal();
	}

	enum Color {
		BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE;
	}
}
