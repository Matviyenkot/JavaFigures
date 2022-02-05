public class Trapeze extends Figure {
    private double main1, main2, height;

//    public Trapeze( double main1TR, double main2TR, double leftBTR, double rightBTR){
//        main1=main1TR;
//        main2=main2TR;
//        leftB=leftBTR;
//        rightB=rightBTR;
//    }

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

//    public void setLeftB( double TrapezeLeft){
//        leftB=TrapezeLeft;
//    }
//
//    public double getLeftB(){
//        return leftB;
//    }
//
//    public void setRightB( double TrapezeRight){
//        rightB=TrapezeRight;
//    }
//
//    public double getRightB(){
//        return rightB;
//    }

    public double getMid(){
        return (main1+main2)/2;
    }

    public double getArea(){
        double m = (main1+main2)/2;
        //double area = Math.sqrt(Math.pow(leftB,2)-Math.pow((Math.pow(main1-main2,2)+Math.pow(leftB,2)-Math.pow(rightB,2))/2*(main1-main2),2))*m;
        //double area = Math.sqrt(leftB*leftB - Math.pow(((main1-main2)*(main1-main2) + leftB*leftB - rightB*rightB) / 2*(main1-main2),2)) * m;
        return m*getHeight();
    }

    public String draw(){
        return ("Фігура: "+ getName()+ ", Площа: "+ getArea()+ ", Середня лінія: "+ getMid() + ", Висота: "+ getHeight() + ", Колір: "+ getColor());
    }

}
