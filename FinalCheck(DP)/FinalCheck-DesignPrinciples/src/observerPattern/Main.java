package observerPattern;

public class Main {

	public static void main(String[] args) {
		
		AdminObserver admin1=new AdminObserver("sonali");
		AdminObserver admin2=new AdminObserver("sonali1");
		AdminObserver admin3=new AdminObserver("sonali2");
		AdminObserver admin4=new AdminObserver("sonali3");
		
		INotificationService is=new NotificationService();
		
		is.addSubscriber(admin1);
		is.addSubscriber(admin2);
		is.addSubscriber(admin3);
		is.addSubscriber(admin4);
		is.notifySubscriber(110);
		is.removeSubscriber(admin4);
		is.notifySubscriber(110);
	}

}
