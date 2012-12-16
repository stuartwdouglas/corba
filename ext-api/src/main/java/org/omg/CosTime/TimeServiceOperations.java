package org.omg.CosTime;


/**
 * Generated from IDL interface "TimeService".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface TimeServiceOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTime.UTO universal_time() throws org.omg.CosTime.TimeUnavailable;
	org.omg.CosTime.UTO secure_universal_time() throws org.omg.CosTime.TimeUnavailable;
	org.omg.CosTime.UTO new_universal_time(long time, long inaccuracy, short tdf);
	org.omg.CosTime.UTO uto_from_utc(org.omg.TimeBase.UtcT utc);
	org.omg.CosTime.TIO new_interval(long lower, long upper);
}
