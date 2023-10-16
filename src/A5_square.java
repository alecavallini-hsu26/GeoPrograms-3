import sun.font.TrueTypeFont;

public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

//        plane.isTrail = true;
//        plane.trailWidth = 5;
//        plane.pausetime = 2;
//        plane.setColor(200, 0, 0);
//
        plane.startingAngle(0);
        plane.teleport(50, 200);
//        triangle();
////        for (int x = 1; x <= 10; x = x + 1) {
////            square();
////        }
////
////        for(int i = 30 ; i < 120 ; i = i + 10){
////
////            System.out.println(i);
////            plane.startingAngle(0);
////            plane.triangle(i);
////        }
//
//        for(int i = 2 ; i < 14; i = i + 2){
//            System.out.println(i);
//            plane.startingAngle(0);
//            plane.square(i);
//        }
//        fives();
//        countDown();
        rowSquares();

    }
    public void drawASquare(){
        for(int i = 1 ; i < 5 ; i = i+1) {

            plane.isTrail = true;
            plane.move(100);
            plane.turn(90);
        }

    }
    public void rowSquares(){
        for(int i=250;i < 1000;i=i+ 200){
            drawASquare();
            plane.isTrail = false;
            plane.move(125);
            plane.teleport(i, 200);
        }
    }
    public void countDown(){
        for(int i = 7 ; i >1 ; i = i - 1){
            System.out.println(i);
        }

    }
    public void fives() {
        for(int i = 5 ; i < 36 ; i = i + 5){
            System.out.println(i);
        }
    }

    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);

    }

    public void triangle() {
        plane.pausetime = 5;
        plane.startingAngle(0);
        plane.setColor(255,255,200);
        plane.isTrail = false;
        plane.move(50);
        plane.trailWidth = 10;
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(50);
        plane.turn(120);
        plane.move(50);
        plane.turn(120);
        plane.move(50);
    }
}





/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/