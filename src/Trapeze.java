public class Trapeze extends Figure {
    private double main1, main2, height;

    public void setBorder1( double TrapezeMain1){
        main1=TrapezeMain1;
    }

    public double getBorder1(){
        return main1;
    }

    public void setBorder2( double TrapezeMain2){
        main2=TrapezeMain2;
    }

    public double getBorder2(){
        return main2;
    }

    public void setHeight( double TrapezeHeight){
        height=TrapezeHeight;
    }

    public double getHeight(){
        return height;
    }

    public double getMid(){
        return (main1+main2)/2;
    }

    public double getArea(){
        double m = (main1+main2)/2;
        return m*getHeight();
    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+ ", Середня лінія: "+ getMid() + ", Висота: "+ getHeight() + ", Колір: "+ getColor());
    }

}
