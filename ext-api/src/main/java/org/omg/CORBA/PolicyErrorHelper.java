package org.omg.CORBA;


/**
 * Generated from IDL exception "PolicyError".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class PolicyErrorHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CORBA.PolicyErrorHelper.id(),"PolicyError",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("reason", org.omg.CORBA.PolicyErrorCodeHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.PolicyError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.PolicyError extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/PolicyError:1.0";
	}
	public static org.omg.CORBA.PolicyError read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		short x0;
		x0=in.read_short();
		final org.omg.CORBA.PolicyError result = new org.omg.CORBA.PolicyError(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.PolicyError s)
	{
		out.write_string(id());
		out.write_short(s.reason);
	}
}
