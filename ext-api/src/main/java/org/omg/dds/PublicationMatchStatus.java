package org.omg.dds;

/**
 * Generated from IDL struct "PublicationMatchStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class PublicationMatchStatus
	implements org.omg.CORBA.portable.IDLEntity
{
	public PublicationMatchStatus(){}
	public int total_count;
	public int total_count_change;
	public int last_subscription_handle;
	public PublicationMatchStatus(int total_count, int total_count_change, int last_subscription_handle)
	{
		this.total_count = total_count;
		this.total_count_change = total_count_change;
		this.last_subscription_handle = last_subscription_handle;
	}
}
