public class Start {
    public static void main(String args[]){
        MainController main=MainController.getInstant();
        main.setVisible(true);
        main.addVehicle(new Helicopter());
        main.addVehicle(new Tank());
        main.addVehicle(new Submarine());
    }
}
