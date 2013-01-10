package org.omg.TimeBase;

/**
 * Generated from IDL struct "IntervalT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class IntervalT
	implements org.omg.CORBA.portable.IDLEntity
{
	public IntervalT(){}
	public long lower_bound;
	public long upper_bound;
	public IntervalT(long lower_bound, long upper_bound)
	{
		this.lower_bound = lower_bound;
		this.upper_bound = upper_bound;
	}
}
