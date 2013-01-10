package org.omg.dds;

/**
 * Generated from IDL struct "DataReaderQos".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DataReaderQosHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.dds.DataReaderQos value;

	public DataReaderQosHolder ()
	{
	}
	public DataReaderQosHolder(final org.omg.dds.DataReaderQos initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.dds.DataReaderQosHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.dds.DataReaderQosHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.dds.DataReaderQosHelper.write(_out, value);
	}
}
