package org.omg.dds;

/**
 * Generated from IDL interface "DataReader".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:43 PM
 */

public final class DataReaderHolder	implements org.omg.CORBA.portable.Streamable{
	 public DataReader value;
	public DataReaderHolder()
	{
	}
	public DataReaderHolder (final DataReader initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DataReaderHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DataReaderHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DataReaderHelper.write (_out,value);
	}
}
