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


    public float getHyp(){
        border3 = (float) Math.sqrt(border1*border1+border2*border2);
        return (float) (Math.floor(border3 * 100) / 100);
    }

    public float getArea(){
        float area = border1*border2/2;
        return (float) (Math.floor(area * 100) / 100);

    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+" кв.од. " +  ", Гіпотенуза: "+ getHyp()+ " од. " + ", Колір: "+ getColor());
    }
}
