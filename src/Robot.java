import java.util.ArrayList;
import java.util.Random;

public class Robot {

    int x;
    int y;

    char direction;

    ArrayList<Point> pointList = new ArrayList<>();


    public Robot() {
        this.x = 0;
        this.y = 0;
        Random random = new Random();
        int r = random.nextInt(4);
        switch (r) {
            case 0:
                direction = 'n';
                break;
            case 1:
                direction = 's';
                break;
            case 2:
                direction = 'w';
                break;
            case 3:
                direction = 'e';
                break;
        }
        pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
    }


    public void move() {

        switch (direction) {
            case 'n':
                y++;
                break;
            case 's':
                y--;
                break;
            case 'w':
                x--;
                break;
            case 'e':
                x++;
                break;

        }
        addPointToList(new Point(x,y));
    }

    public void rotateRight() {
        switch (direction) {
            case 'n':
                direction = 'e';
                break;
            case 's':
                direction = 'w';
                break;
            case 'w':
                direction = 'n';
                break;
            case 'e':
                direction = 's';
                break;
        }
    }

    public void rotateLeft() {
        switch (direction) {
            case 'n':
                direction = 'w';
                break;
            case 's':
                direction = 'e';
                break;
            case 'w':
                direction = 's';
                break;
            case 'e':
                direction = 'n';
                break;
        }
    }

    public void addPointToList(Point p){
        pointList.add(p);
    }

}

