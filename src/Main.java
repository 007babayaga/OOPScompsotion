public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor monitor = new Monitor("27 inch Beast","Acer",27,"2540x3450");
        Motherboard motherboard = new Motherboard("BJ_200","Asus",4,6,"v2.6");
        PersonalComputer  pc = new PersonalComputer("2208","Dell",monitor,motherboard,theCase);
        /*pc.getMonitor().DrawPixelAt(3,5,"red");
         pc.getMotherboard().loadProgram("Booting");
        pc.getComputerCase().powerButton();*/
        pc.PressPowerButton();



    }
}
