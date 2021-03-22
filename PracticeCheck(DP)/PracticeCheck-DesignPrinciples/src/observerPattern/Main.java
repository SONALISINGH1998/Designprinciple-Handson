package observerPattern;

public class Main {

	public static void main(String[] args) {
		
		SteveObserver steve=new SteveObserver();
		JohnObserver john=new JohnObserver();
		
		INotificationService is=new NotificationService();
		is.addSubscriber(steve);
		is.addSubscriber(john);
		is.notifySubscriber();
		is.removeSubscriber(john);
		is.notifySubscriber();
		
	}

}
