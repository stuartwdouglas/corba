package org.omg.PortableInterceptor;


/**
 * Generated from IDL exception "ForwardRequest".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class ForwardRequestHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.PortableInterceptor.ForwardRequestHelper.id(),"ForwardRequest",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("forward", org.omg.CORBA.ORB.init().get_primitive_tc( org.omg.CORBA.TCKind.tk_objref), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.PortableInterceptor.ForwardRequest s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.PortableInterceptor.ForwardRequest extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/PortableInterceptor/ForwardRequest:1.0";
	}
	public static org.omg.PortableInterceptor.ForwardRequest read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		org.omg.CORBA.Object x0;
		x0=in.read_Object();
		final org.omg.PortableInterceptor.ForwardRequest result = new org.omg.PortableInterceptor.ForwardRequest(id, x0);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.PortableInterceptor.ForwardRequest s)
	{
		out.write_string(id());
		out.write_Object(s.forward);
	}
}