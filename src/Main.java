import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
сделать Робота
робот бегает по плоской координатной сетке
он знает в какой клетке находится сейчас (x,y)
робот изначально оказывается в центре - в точке (0,0)
у робота есть метод двигаться вперед на 1 шаг
метод повернуть налево на 90 градусов
метод повернуть направо на 90 градусов
 */
        Robot r = new Robot();
//        printState(r);
//        r.move(); printState(r);
//        r.rotateRight(); printState(r);
//        r.move(); printState(r);
//        r.rotateRight(); printState(r);
//        r.move(); printState(r);
//        r.move(); printState(r);
//        r.rotateLeft(); printState(r);
//        r.move(); printState(r);

        String fileInput1 =  "src/a1.txt";
        String fileInput2 =  "src/a2.txt";
        String fileOutput = "src/res.txt";

        String s = readStringFromFile(fileInput1);
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'S':
                  r.move();
                  r.addPoitToList(r.x, r.y);

            }
        }


    }

    private static void printState(Robot r) {
        System.out.println("местоположение " + r.x + " " + r.y + ",  направление " + r.direction);
    }

    static String readStringFromFile(String fileInput){
        String s="";
        try{
            Scanner sc = new Scanner(new File(fileInput));
            s = sc.next();
//            FileWriter output = new FileWriter((new File(fileOutput)));
//            System.out.println("значение равно " + (x+y));
//            String s = "значение равно " + (x+y);
//            output.write(s);
//            sc.close();
//            output.close();
        }
        catch(FileNotFoundException r){
            System.out.println("нет файла");
        }
        catch(IOException e){
            System.out.println("нет файла");
        }
        return s;
    }


}