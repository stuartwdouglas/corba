package org.omg.CSIIOP;


/**
 * Generated from IDL struct "ServiceConfiguration".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class ServiceConfigurationHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.ServiceConfigurationHelper.id(),"ServiceConfiguration",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("syntax", org.omg.CSIIOP.ServiceConfigurationSyntaxHelper.type(), null),new org.omg.CORBA.StructMember("name", org.omg.CSIIOP.ServiceSpecificNameHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.ServiceConfiguration s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.ServiceConfiguration extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/ServiceConfiguration:1.0";
	}
	public static org.omg.CSIIOP.ServiceConfiguration read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.ServiceConfiguration result = new org.omg.CSIIOP.ServiceConfiguration();
		result.syntax=in.read_ulong();
		result.name = org.omg.CSIIOP.ServiceSpecificNameHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.ServiceConfiguration s)
	{
		out.write_ulong(s.syntax);
		org.omg.CSIIOP.ServiceSpecificNameHelper.write(out,s.name);
	}
}
