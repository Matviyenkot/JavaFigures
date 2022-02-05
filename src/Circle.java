public class Circle extends Figure {
    private float radius;

    public void setRadius(float circleRadius){
        radius=circleRadius;
    }

    public float getRadius(){
        return radius;
    }

    public double getArea(){
        double area = Math.PI*Math.pow(radius,2);
        return Math.floor(area * 100) / 100;
    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+" кв.од. " +  ", Радіус: "+ getRadius()+ " од. " + ", Колір: "+ getColor());
    }
}
