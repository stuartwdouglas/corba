package org.omg.CosNotification;


/**
 * Generated from IDL struct "NamedPropertyRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:23 AM
 */

public final class NamedPropertyRangeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosNotification.NamedPropertyRangeHelper.id(),"NamedPropertyRange",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CosNotification.PropertyNameHelper.type(), null),new org.omg.CORBA.StructMember("range", org.omg.CosNotification.PropertyRangeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosNotification.NamedPropertyRange s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosNotification.NamedPropertyRange extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosNotification/NamedPropertyRange:1.0";
	}
	public static org.omg.CosNotification.NamedPropertyRange read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosNotification.NamedPropertyRange result = new org.omg.CosNotification.NamedPropertyRange();
		result.name=in.read_string();
		result.range=org.omg.CosNotification.PropertyRangeHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosNotification.NamedPropertyRange s)
	{
		out.write_string(s.name);
		org.omg.CosNotification.PropertyRangeHelper.write(out,s.range);
	}
}
