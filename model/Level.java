package model;

enum Level {
    EMPLOYEE(1), CLIENT(2);

    private final int level;

    Level (int level) {
        this.level = level;
    }

	public int get() {
		return (this.level);
	}
}
