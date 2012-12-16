package org.omg.Messaging;


/**
 * Generated from IDL struct "PriorityRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class PriorityRangeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.Messaging.PriorityRangeHelper.id(),"PriorityRange",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("min", org.omg.Messaging.PriorityHelper.type(), null),new org.omg.CORBA.StructMember("max", org.omg.Messaging.PriorityHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Messaging.PriorityRange s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Messaging.PriorityRange extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Messaging/PriorityRange:1.0";
	}
	public static org.omg.Messaging.PriorityRange read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.Messaging.PriorityRange result = new org.omg.Messaging.PriorityRange();
		result.min=in.read_short();
		result.max=in.read_short();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.Messaging.PriorityRange s)
	{
		out.write_short(s.min);
		out.write_short(s.max);
	}
}
