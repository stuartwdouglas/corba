package org.omg.CosConcurrencyControl;
/**
 * Generated from IDL enum "lock_mode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class lock_modeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosConcurrencyControl.lock_modeHelper.id(),"lock_mode",new String[]{"read","write","upgrade","intention_read","intention_write"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosConcurrencyControl.lock_mode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosConcurrencyControl.lock_mode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosConcurrencyControl/lock_mode:1.0";
	}
	public static lock_mode read (final org.omg.CORBA.portable.InputStream in)
	{
		return lock_mode.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final lock_mode s)
	{
		out.write_long(s.value());
	}
}
