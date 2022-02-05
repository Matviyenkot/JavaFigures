public class Figure {
    public String name;
    public String color;

    public void printName(){
        System.out.println("You drew: "+ name);
    }

    public void printColor(){
        System.out.println("Your color: "+ color);
    }

    public void setColor( String figureColor){
        color=figureColor;
    }

    public String getColor(){
        return color;
    }

    public void setName( String figureName){
        name=figureName;
    }

    public String getName(){
        return name;
    }

}
