package org.omg.dds;

/**
 * Generated from IDL struct "SampleLostStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class SampleLostStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public SampleLostStatus(){}
	public int total_count;
	public int total_count_change;
	public SampleLostStatus(int total_count, int total_count_change)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
	}
}
