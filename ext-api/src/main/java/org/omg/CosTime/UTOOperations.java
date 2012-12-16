package org.omg.CosTime;


/**
 * Generated from IDL interface "UTO".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface UTOOperations
{
	/* constants */
	/* operations  */
	long time();
	long inaccuracy();
	short tdf();
	org.omg.TimeBase.UtcT utc_time();
	org.omg.CosTime.UTO absolute_time();
	org.omg.CosTime.TimeComparison compare_time(org.omg.CosTime.ComparisonType comparison_type, org.omg.CosTime.UTO uto_);
	org.omg.CosTime.TIO time_to_interval(org.omg.CosTime.UTO uto_);
	org.omg.CosTime.TIO interval();
}
