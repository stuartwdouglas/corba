package org.omg.dds;

/**
 * Generated from IDL struct "EntityFactoryQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class EntityFactoryQosPolicyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.EntityFactoryQosPolicy value;

	public EntityFactoryQosPolicyHolder ()
	{
	}
	public EntityFactoryQosPolicyHolder(final org.omg.dds.EntityFactoryQosPolicy initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.EntityFactoryQosPolicyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.EntityFactoryQosPolicyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.EntityFactoryQosPolicyHelper.write(_out, value);
	}
}
