public class Airplane {
    private String manufacturer = "Acro Sport";
    private String model = "Acro Sport";
    private String physicalClass = "Piston";
    private int  engines = 1;
    private int approachSpeed = 56;
    private double wingspan = 19.58;
    private double length = 17.50;
    private double tailHeight = 6.0;
    private double wheelbase = 10.0;
    private int parkingArea = 343;

    public String setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        return this.manufacturer;
    }

    public void getManufacturer(){
        System.out.println("Manufacturer is " + this.manufacturer);
    }

    public String setModel(String model) {
        this.model = model;
        return this.model;
    }

    public void getModel(){
        System.out.println("Airplane model is " + this.model);
    }

    public String setPhysicalClass(String physicalClass){
        this.physicalClass = physicalClass;
        return this.physicalClass;
    }

    public void getPhysicalClass(){
        System.out.println("Airplane is in " + this.physicalClass + " class");
    }


    public int setEngines(int engines){
        this.engines = engines;
        return this.engines;
    }

    public void getEngines(){
        if (this.engines > 1) {
            System.out.println(this.physicalClass + " has " + this.engines + " Engines");
        }else{
            System.out.println(this.physicalClass + " has " + this.engines + " Engine");
        }
    }

    public int setApproachSpeed(int approachSpeed){
        this.approachSpeed = approachSpeed;
        return  this.approachSpeed;
    }

    public void getApproachSpeed(){
        System.out.println("Airplane speed is " + this.approachSpeed + " km/h");
    }

    public double setWingspan(double wingspan){
        this.wingspan = wingspan;
        return this.wingspan;
    }

    public void getWingspan(){
        System.out.println("Wingspan length is " + this.wingspan + " ft");
    }


    public double setLength(double length){
        this.length = length;
        return this.length;
    }

    public void getLength(){
        System.out.println(this.model + " length is " + this.length + " ft");
    }

    public double setTailHeight(double tailHeight){
        this.tailHeight = tailHeight;
        return this.tailHeight;
    }

    public void getTailHeight(){
        System.out.println("Tail height is " + this.tailHeight + " ft");
    }

    public double setWheelbase(double wheelbase){
        this.wheelbase = wheelbase;
        return this.wheelbase;
    }

    public void getWheelbase(){
        System.out.println("Wheelbase is " + this.wheelbase + " ft");
    }

    public int setParkingArea(int parkingArea){
        this.parkingArea = parkingArea;
        return this.parkingArea;
    }

    public void getParkingArea(){
        System.out.println("Parking area is " + this.parkingArea + " sf");
    }

}
