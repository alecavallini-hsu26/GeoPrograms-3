public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        for(int x=0;x<500;x=x+100) {
            System.out.println(x);
//            plane.teleport(x+10, 100);
//            plane.square(100);
//           rowofSquares();
//            columnofSquares();
            gridofsquares();


        }
    }
//    public void rowofSquares(){
//        //in this method, create a long row of 10 pixel by 10 pixel squares
//        plane.trailWidth=5;
//        for(int x=0;x<200;x=x+10) {
//            System.out.println(x);
//            plane.teleport(x+10, 100);
//            plane.square(10);
//        }
//
//    }
   public void drawaSquare(){
        plane.square(10);
    }
    public void columnofSquares(){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        for(int x=0;x<200;x=x+20) {
            plane.trailWidth=5;
            plane.startingAngle(90);
            drawaSquare();
            plane.move(10);
        }
        //put your loop here

    }
    public void gridofsquares(){
        plane.trailWidth=10;
        plane.pausetime=0;
        for(int x=0;x<1400;x=x+10) {
            System.out.println("sprint" + x);
            for (int y=0;y<800;y=y+10){
                System.out.println("pushup"+y);
                plane.teleport(x,y);
                plane.setColor(250, 125, y/1/4);
                plane.square(10);
            }
        }



        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?
        //put your loop here
//        plane.trailWidth=5;
//        for(int x=0;x<200;x=x+10) {
//           plane.setColor(50,25,x);
//           columnofSquares();
//           plane.startingAngle(0);
//           plane.move(10);
//           plane.turn(270);
//           plane.move(55);
//        }

    }

}
