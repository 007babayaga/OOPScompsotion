public class Product {
    private String model;
    private  String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer ) {
        this.model = model;
        this.manufacturer = manufacturer;

    }

}
class Monitor extends Product{

    private int size;
    private String Resolution;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public Monitor(String model, String manufacturer,int size,String Resolution) {
        super(model, manufacturer);
        this.size=size;
        this.Resolution=Resolution;
    }
    public  void DrawPixelAt(int x,int y,String Color){
        //System.out.println(x,y,Color);
    }

}
class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private  String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String ProgramName){
        System.out.println("Program " +ProgramName+ " is loading");
    }
}
class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void powerButton(){
        System.out.println("POWER BUTTON PRESSED");
    }
}
