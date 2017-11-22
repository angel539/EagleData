package uam.eagledata.core.discovering.utils.dbscan;

/**
 * Interface for the implementation of distance metrics.
 * 
 * @author <a href="mailto:cf@christopherfrantz.org>Christopher Frantz</a>
 *
 * @param <V> Value type to which distance metric is applied.
 */
public interface DistanceMetric<V> {

	public double calculateDistance(V val1, V val2) throws DBSCANClusteringException;

}
