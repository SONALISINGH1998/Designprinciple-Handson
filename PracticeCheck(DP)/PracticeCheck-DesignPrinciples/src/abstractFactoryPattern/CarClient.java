package abstractFactoryPattern;

public class CarClient {
	

	public static void main(String[] args) {
		
		CarFactory cfl=new FactoryLuxuryCar();
		System.out.println(cfl.buildCar(CarType.LUXURY,Location.DEFAULT));

		CarFactory cfm=new FactoryMicroCar();
		System.out.println(cfm.buildCar(CarType.MICRO,Location.USA));

		CarFactory cfmi=new FactoryMiniCar();
		System.out.println(cfmi.buildCar(CarType.MINI,Location.INDIA));
	}
	
}
