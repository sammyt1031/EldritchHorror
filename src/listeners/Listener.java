package listeners;

public abstract class Listener {
	
	private final Enum e;
	
	protected Listener(Enum e) {
		this.e = e;
	}
	
	public abstract void update();
	
	public Enum getEnum() {
		return this.e;
	}
	
}
