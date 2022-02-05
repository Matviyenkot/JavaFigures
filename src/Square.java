public class Square extends Figure {
    private float border;


    public void setBorder( float squareBorder){
        border=squareBorder;
    }

    public float getBorder(){
        return border;
    }


    public double getArea(){
        double area = border*border;
        return Math.floor(area * 100) / 100;
    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+ ", Сторона: "+ getBorder()+ ", Колір: "+ getColor());
    }
}
