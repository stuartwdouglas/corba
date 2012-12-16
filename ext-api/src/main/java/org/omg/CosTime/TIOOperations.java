package org.omg.CosTime;


/**
 * Generated from IDL interface "TIO".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public interface TIOOperations
{
	/* constants */
	/* operations  */
	org.omg.TimeBase.IntervalT time_interval();
	org.omg.CosTime.OverlapType spans(org.omg.CosTime.UTO time, org.omg.CosTime.TIOHolder overlap);
	org.omg.CosTime.OverlapType overlaps(org.omg.CosTime.TIO interval, org.omg.CosTime.TIOHolder overlap);
	org.omg.CosTime.UTO time();
}
