package org.omg.dds;

/**
 * Generated from IDL struct "GroupDataQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class GroupDataQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.GroupDataQosPolicy value;

	public GroupDataQosPolicyHolder ()
	{
	}
	public GroupDataQosPolicyHolder(final org.omg.dds.GroupDataQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.GroupDataQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.GroupDataQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.GroupDataQosPolicyHelper.write(_out, value);
	}
}
