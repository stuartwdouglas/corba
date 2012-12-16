package org.omg.CosConcurrencyControl;


/**
 * Generated from IDL exception "LockNotHeld".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:49 PM
 */

public final class LockNotHeldHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosConcurrencyControl.LockNotHeldHelper.id(),"LockNotHeld",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosConcurrencyControl.LockNotHeld s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosConcurrencyControl.LockNotHeld extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosConcurrencyControl/LockNotHeld:1.0";
	}
	public static org.omg.CosConcurrencyControl.LockNotHeld read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosConcurrencyControl.LockNotHeld result = new org.omg.CosConcurrencyControl.LockNotHeld(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosConcurrencyControl.LockNotHeld s)
	{
		out.write_string(id());
	}
}
