package org.omg.IIOP;


/**
 * Generated from IDL struct "BiDirIIOPServiceContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class BiDirIIOPServiceContextHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.IIOP.BiDirIIOPServiceContextHelper.id(),"BiDirIIOPServiceContext",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("listen_points", org.omg.IIOP.ListenPointListHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.IIOP.BiDirIIOPServiceContext s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.IIOP.BiDirIIOPServiceContext extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/IIOP/BiDirIIOPServiceContext:1.0";
	}
	public static org.omg.IIOP.BiDirIIOPServiceContext read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.IIOP.BiDirIIOPServiceContext result = new org.omg.IIOP.BiDirIIOPServiceContext();
		result.listen_points = org.omg.IIOP.ListenPointListHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.IIOP.BiDirIIOPServiceContext s)
	{
		org.omg.IIOP.ListenPointListHelper.write(out,s.listen_points);
	}
}
