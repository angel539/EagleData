package uam.eagledata.core.discovering.utils.dbscan;

/**
 * Distance metric implementation for numeric values.
 * 
 * @author <a href="mailto:cf@christopherfrantz.org>Christopher Frantz</a>
 *
 */
public class DistanceMetricNumbers implements DistanceMetric<Number>{

	@Override
	public double calculateDistance(Number val1, Number val2) {
		return Math.abs(val1.doubleValue() - val2.doubleValue());
	}

}
