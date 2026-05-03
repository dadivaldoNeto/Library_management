package model;

enum State {
	OVERDUE(1), ACTIVE(2), COMPLETED(3);

	private final int state;
	State(int i) {
		this.state = i;
	}

	public int get() {
		return (this.state);
	}
}
