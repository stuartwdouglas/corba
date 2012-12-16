package org.omg.SSLIOP;


/**
 * Generated from IDL struct "SSL".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SSLHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.SSLIOP.SSLHelper.id(),"SSL",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_supports", org.omg.Security.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("target_requires", org.omg.Security.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("port", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(4)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.SSLIOP.SSL s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.SSLIOP.SSL extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/SSLIOP/SSL:1.0";
	}
	public static org.omg.SSLIOP.SSL read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.SSLIOP.SSL result = new org.omg.SSLIOP.SSL();
		result.target_supports=in.read_ushort();
		result.target_requires=in.read_ushort();
		result.port=in.read_ushort();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.SSLIOP.SSL s)
	{
		out.write_ushort(s.target_supports);
		out.write_ushort(s.target_requires);
		out.write_ushort(s.port);
	}
}
