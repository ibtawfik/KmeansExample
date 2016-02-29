import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by islam on 2/28/16.
 */
public class KmeansTest {
    public static void main(String[] args) {
        List<Point> inputs = new ArrayList<Point>();
        inputs.add(new Point(1,1));
        inputs.add(new Point(1,2));
        inputs.add(new Point(2,3));
        inputs.add(new Point(5,2));
        inputs.add(new Point(9,1));
        inputs.add(new Point(10,5));
        inputs.add(new Point(5,5));
        inputs.add(new Point(1000,1000));

        KMeansPlusPlusClusterer<Point> clusterer = new KMeansPlusPlusClusterer<Point>(2, 1000);
        List<CentroidCluster<Point>> clusterResults = clusterer.cluster(inputs);

        for (int i=0; i<clusterResults.size(); i++) {
            System.out.println("Cluster " + i);
            for (Point point : clusterResults.get(i).getPoints())
                System.out.println(point.getLocation());
            System.out.println();
        }
    }
}
