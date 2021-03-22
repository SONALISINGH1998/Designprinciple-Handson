package observerPattern;

public class JohnObserver implements INotificationObserver {
	
	String name="John";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void onServerDown() {
		System.out.println(name+ ": Notification has been received");
	}
	
	public String toString() {
		return name;
	}

}
