public class ServiceStation {
    public void check(Vehicle vehicle) {
        vehicle.check();
    }
    public void service(Vehicle vehicle) {
        System.out.println("Обслуживаем" + vehicle.getModelName());
        for (int i =0; i< vehicle.getWheelsCount(); i++) {
    }
    }

}