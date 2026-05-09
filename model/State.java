package model;

enum State {
	BORROW(1), IN_STOCK(2);

	private final int state;
	State(int i) {
		this.state = i;
	}

	public int get() {
		return (this.state);
	}
}
