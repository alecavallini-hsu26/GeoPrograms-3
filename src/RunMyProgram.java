

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B3_HalfTheRed()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="CompSciPhoto.png";
        run.HEIGHT=760;
        run.WIDTH=575;
        run.Refresh();

        //new Thread(run).start();
    }
}
