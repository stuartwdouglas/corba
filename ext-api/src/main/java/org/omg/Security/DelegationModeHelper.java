package org.omg.Security;
/**
 * Generated from IDL enum "DelegationMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class DelegationModeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.Security.DelegationModeHelper.id(),"DelegationMode",new String[]{"SecDelModeNoDelegation","SecDelModeSimpleDelegation","SecDelModeCompositeDelegation"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.Security.DelegationMode s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.Security.DelegationMode extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/Security/DelegationMode:1.0";
	}
	public static DelegationMode read (final org.omg.CORBA.portable.InputStream in)
	{
		return DelegationMode.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final DelegationMode s)
	{
		out.write_long(s.value());
	}
}
