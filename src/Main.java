import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] colors = {"Синій", "Жовтий", "Червоний", "Зелений", "Чорний"};

        int countOfFigures = 1 + (int) (Math.random() * 20);
        String[] figures = new String[countOfFigures];

        for (int i = 1; i <= countOfFigures; i++) {
            int rndFigure = (int) (Math.random() * 4);
            int rndCol = (int) (Math.random() * colors.length);
            switch (rndFigure) {
                case (0):
                    Square s1 = new Square();
                   // float b = 1 + (float) (Math.random() * 10);
                    float b = (float) (Math.floor((1+ (Math.random() * 10)) * 100) /100);
                    s1.setBorder(b);
                    s1.setColor(colors[rndCol]);
                    s1.setName("Квадрат");
                    figures[i-1] = s1.draw();
                    break;
                case (1):
                    Circle c1 = new Circle();
                    //float r = 1 + (float) (Math.random() * 10);
                    float r = (float) (Math.floor((1+ (Math.random() * 10)) * 100) /100);
                    c1.setRadius(r);
                    c1.setColor(colors[rndCol]);
                    c1.setName("Круг");
                    figures[i-1] = c1.draw();
                    break;
                case (2):
                    Triangle t1 = new Triangle();
                    t1.setName("Трикутник");
                    t1.setColor(colors[rndCol]);
                    t1.setBorder1((float) (Math.floor((1+ (Math.random() * 10)) * 100) /100));
                    t1.setBorder2((float) (Math.floor((1+ (Math.random() * 10)) * 100) /100));
                    figures[i-1] = t1.draw();
                    break;
                case (3):
                    Trapeze tr1 = new Trapeze();
                    tr1.setName("Трапеція");
                    tr1.setColor(colors[rndCol]);
                    tr1.setBorder1(7);
                    tr1.setBorder2(4);
                    tr1.setHeight(2);
                    figures[i-1] = tr1.draw();
                    break;
        }
    }

        for(int i =0; i<figures.length; i++){    //виводить масив з фігурами
            System.out.println(figures[i]);
        }


    }
}
