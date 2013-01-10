package org.omg.CSI;


/**
 * Generated from IDL struct "AuthorizationElement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AuthorizationElementHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSI.AuthorizationElementHelper.id(),"AuthorizationElement",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("the_type", org.omg.CSI.AuthorizationElementTypeHelper.type(), null),new org.omg.CORBA.StructMember("the_element", org.omg.CSI.AuthorizationElementContentsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSI.AuthorizationElement s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSI.AuthorizationElement extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/AuthorizationElement:1.0";
	}
	public static org.omg.CSI.AuthorizationElement read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSI.AuthorizationElement result = new org.omg.CSI.AuthorizationElement();
		result.the_type=in.read_ulong();
		result.the_element = org.omg.CSI.AuthorizationElementContentsHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSI.AuthorizationElement s)
	{
		out.write_ulong(s.the_type);
		org.omg.CSI.AuthorizationElementContentsHelper.write(out,s.the_element);
	}
}
