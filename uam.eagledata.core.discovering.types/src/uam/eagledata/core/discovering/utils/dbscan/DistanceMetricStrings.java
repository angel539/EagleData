package uam.eagledata.core.discovering.utils.dbscan;

import org.apache.commons.lang3.StringUtils;

/**
 * Distance metric implementation for numeric values.
 * 
 * @author <a href="mailto:cf@christopherfrantz.org>Christopher Frantz</a>
 *
 */
public class DistanceMetricStrings implements DistanceMetric<String>{

	@Override
	public double calculateDistance(String val1, String val2) {
		double value = StringUtils.getLevenshteinDistance(val1, val2);
		return value;
	}

}
