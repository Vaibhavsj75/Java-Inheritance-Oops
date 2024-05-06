class AeroPlane{

    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends AeroPlane
{
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries Goods");
    }

}
class PassengerPlane extends AeroPlane
{
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger");
    }

}
class Inheritance3{

    public static void main(String[] args) {
        
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp=new PassengerPlane();
        pp.takeOff();
        pp.fly();
}
}