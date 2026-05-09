package model;

enum Level {
    EMPLOYEE(1), CLIENT(2);

    private final byte level;

    Level (byte level) {
        this.level = level;
    }

	public byte get() {
		return (this.level);
	}
}
