package org.omg.dds;

/**
 * Generated from IDL interface "DataWriter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DataWriterHolder	implements org.omg.CORBA.portable.Streamable{
	 public DataWriter value;
	public DataWriterHolder()
	{
	}
	public DataWriterHolder (final DataWriter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DataWriterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DataWriterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DataWriterHelper.write (_out,value);
	}
}
