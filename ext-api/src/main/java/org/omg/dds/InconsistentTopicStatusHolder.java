package org.omg.dds;

/**
 * Generated from IDL struct "InconsistentTopicStatus".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class InconsistentTopicStatusHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.InconsistentTopicStatus value;

	public InconsistentTopicStatusHolder ()
	{
	}
	public InconsistentTopicStatusHolder(final org.omg.dds.InconsistentTopicStatus initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.InconsistentTopicStatusHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.InconsistentTopicStatusHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.InconsistentTopicStatusHelper.write(_out, value);
	}
}
