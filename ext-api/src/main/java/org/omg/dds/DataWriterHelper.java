package org.omg.dds;


/**
 * Generated from IDL interface "DataWriter".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DataWriterHelper
{
	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.DataWriter s)
	{
			any.insert_Object(s);
	}
	public static org.omg.dds.DataWriter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/dds/DataWriter:1.0", "DataWriter");
	}
	public static String id()
	{
		return "IDL:omg.org/dds/DataWriter:1.0";
	}
	public static DataWriter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(org.omg.dds._DataWriterStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final org.omg.dds.DataWriter s)
	{
		_out.write_Object(s);
	}
	public static org.omg.dds.DataWriter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DataWriter)
		{
			return (org.omg.dds.DataWriter)obj;
		}
		else if (obj._is_a("IDL:omg.org/dds/DataWriter:1.0"))
		{
			org.omg.dds._DataWriterStub stub;
			stub = new org.omg.dds._DataWriterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static org.omg.dds.DataWriter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof org.omg.dds.DataWriter)
		{
			return (org.omg.dds.DataWriter)obj;
		}
		else
		{
			org.omg.dds._DataWriterStub stub;
			stub = new org.omg.dds._DataWriterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
