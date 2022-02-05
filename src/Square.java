public class Square extends Figure {
    private float border;
    //private String color;


    public void setBorder( float squareBorder){
        border=squareBorder;
    }

    public float getBorder(){
        return border;
    }

//    public void setColor( String squareColor){
//        color=squareColor;
//    }
//
//    public String getColor(){
//        return color;
//    }
//
//    public void setName( String squareName){
//        name=squareName;
//    }
//
//    public String getName(){
//        return name;
//    }

    public double getArea(){
        double area = border*border;
        return Math.floor(area * 100) / 100;
    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+ ", Сторона: "+ getBorder()+ ", Колір: "+ getColor());
    }
}
