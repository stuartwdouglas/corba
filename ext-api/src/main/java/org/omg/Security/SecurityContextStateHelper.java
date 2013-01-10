package org.omg.Security;
/**
 * Generated from IDL enum "SecurityContextState".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SecurityContextStateHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.SecurityContextStateHelper.id(),"SecurityContextState",new String[]{"SecContextInitialized","SecContextContinued","SecContextClientEstablished","SecContextEstablished","SecContextEstablishExpired","SecContextExpired","SecContextInvalid"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.SecurityContextState s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.SecurityContextState extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/SecurityContextState:1.0";
	}
	public static SecurityContextState read (final org.omg.CORBA.portable.InputStream in)
	{
		return SecurityContextState.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final SecurityContextState s)
	{
		out.write_long(s.value());
	}
}
