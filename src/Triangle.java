public class Triangle extends Figure {
    private float border1, border2, border3;

    public void setBorder1( float triangleBorder1){
        border1=triangleBorder1;
    }

    public float getBorder1(){
        return border1;
    }

    public void setBorder2(float triangleBorder2){
        border2=triangleBorder2;
    }

    public float getBorder2(){
        return border2;
    }

//    public void setBorder3( double triangleBorder3){
//        border3=triangleBorder3;
//    }
//
//    public double getBorder3(){
//        return border3;
//    }

//    public void setColor( String triangleColor){
//        color=triangleColor;
//    }
//
//    public String getColor(){
//        return color;
//    }
//
//    public void setName( String triangleName){
//        name=triangleName;
//    }
//
//    public String getName(){
//        return name;
//    }

    public float getHyp(){
        border3 = (float) Math.sqrt(border1*border1+border2*border2);
        return (float) (Math.floor(border3 * 100) / 100);
    }

//    public double getArea(){
//        double p = (border1+border2+border3)/2;
//        double area = Math.sqrt(p*(p-border1)*(p-border2)*(p-border3));
//        return area;
//    }

    public float getArea(){
        float area = border1*border2/2;
        return (float) (Math.floor(area * 100) / 100);

    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+ ", Гіпотенуза: "+ getHyp()+ ", Колір: "+ getColor());
    }
}
