package Hinh1;

class Cylinder extends Circle {
    private double hight;
    public Cylinder(){
    }
    public Cylinder(double hight,double radius,String color){
        super(radius, color);
        this.hight=hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getThetich(){
        return super.getArea()*hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +

                '}'+
                 "the tich la"+ getThetich()+
                super.toString();

    }
}
