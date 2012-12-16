package org.omg.dds;

/**
 * Generated from IDL struct "LivelinessChangedStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class LivelinessChangedStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public LivelinessChangedStatus(){}
	public int active_count;
	public int inactive_count;
	public int active_count_change;
	public int inactive_count_change;
	public LivelinessChangedStatus(int active_count, int inactive_count, int active_count_change, int inactive_count_change)
	{
		this.active_count = active_count;
		this.inactive_count = inactive_count;
		this.active_count_change = active_count_change;
		this.inactive_count_change = inactive_count_change;
	}
}
