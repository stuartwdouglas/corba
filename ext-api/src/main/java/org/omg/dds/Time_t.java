package org.omg.dds;

/**
 * Generated from IDL struct "Time_t".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class Time_t
	implements org.omg.CORBA.portable.IDLEntity
{
	public Time_t(){}
	public int sec;
	public int nanosec;
	public Time_t(int sec, int nanosec)
	{
		this.sec = sec;
		this.nanosec = nanosec;
	}
}
