package org.omg.Messaging;

/**
 * Generated from IDL valuetype "ExceptionHolder".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public abstract class ExceptionHolderHelper
{
	private static org.omg.CORBA.TypeCode type = null;
	public static void insert (org.omg.CORBA.Any a, org.omg.Messaging.ExceptionHolder v)
	{
		a.insert_Value (v, v._type());
	}
	public static org.omg.Messaging.ExceptionHolder extract (org.omg.CORBA.Any a)
	{
		return (org.omg.Messaging.ExceptionHolder)a.extract_Value();
	}
	public static org.omg.CORBA.TypeCode type()
	{
		if (type == null)
			type = org.omg.CORBA.ORB.init().create_value_tc ("IDL:omg.org/Messaging/ExceptionHolder:1.0", "ExceptionHolder", (short)0, null, new org.omg.CORBA.ValueMember[] {new org.omg.CORBA.ValueMember ("", "IDL:*primitive*:1.0", "ExceptionHolder", "1.0", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null, (short)0), new org.omg.CORBA.ValueMember ("", "IDL:*primitive*:1.0", "ExceptionHolder", "1.0", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null, (short)0), new org.omg.CORBA.ValueMember ("", "IDL:marshaled_exception:1.0", "ExceptionHolder", "1.0", org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(10))), null, (short)0)});
		return type;
	}
	public static String id()
	{
		return "IDL:omg.org/Messaging/ExceptionHolder:1.0";
	}
	public static org.omg.Messaging.ExceptionHolder read (org.omg.CORBA.portable.InputStream is)
	{
		return (org.omg.Messaging.ExceptionHolder)((org.omg.CORBA_2_3.portable.InputStream)is).read_value ("IDL:omg.org/Messaging/ExceptionHolder:1.0");
	}
	public static void write (org.omg.CORBA.portable.OutputStream os, org.omg.Messaging.ExceptionHolder val)
	{
((org.omg.CORBA_2_3.portable.OutputStream)os).write_value (val, "IDL:omg.org/Messaging/ExceptionHolder:1.0");
	}
}
