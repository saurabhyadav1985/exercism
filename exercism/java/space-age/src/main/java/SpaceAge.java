class SpaceAge {

	double seconds;
	int earthAge = 31557600;
	
	SpaceAge(double seconds) {
		if (seconds < 0) {
			throw new IllegalArgumentException("Age can not be negative");
		}
		this.seconds = seconds;
	}

	double getSeconds() {
		return seconds;
	}

	double onEarth() {
		return seconds/earthAge;
	}

	double onMercury() {
		return onEarth() / OrbitalPeriod.MERCURY.getPeriodFactor();
	}

	double onVenus() {
		return onEarth() / OrbitalPeriod.VENUS.getPeriodFactor();
	}

	double onMars() {
		return onEarth() / OrbitalPeriod.MARS.getPeriodFactor();
	}

	double onJupiter() {
		return onEarth() / OrbitalPeriod.JUPITER.getPeriodFactor();
	}

	double onSaturn() {
		return onEarth() / OrbitalPeriod.SATURN.getPeriodFactor();
	}

	double onUranus() {
		return onEarth() / OrbitalPeriod.URANUS.getPeriodFactor();
	}

	double onNeptune() {
		return onEarth() / OrbitalPeriod.NEPTUNE.getPeriodFactor();
	}

	enum OrbitalPeriod {
		EARTH(1.0),MERCURY(0.2408467),VENUS(0.61519726),MARS(1.8808158),JUPITER(11.862615),SATURN(29.447498),URANUS(84.016846),NEPTUNE(164.79132);
		
		private double periodFactor;

		private OrbitalPeriod(double periodFactor) {
			this.periodFactor = periodFactor;
		}
		
		public double getPeriodFactor() {
			return periodFactor;
		}

	}
}
