import org.apache.commons.math3.ml.clustering.Clusterable;

/**
 * Created by islam on 2/28/16.
 */
public class Point implements Clusterable {
    double x;
    double y;
    public Point(double x, double y){
        this.x =x;
        this.y = y;
    }

    public double[] getPoint() {
        return new double[]{this.x, this.y};
    }

    public String getLocation(){
        return this.x + ", " + this.y;
    }
}
