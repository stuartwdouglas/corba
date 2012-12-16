package org.omg.CORBA;


/**
 * Generated from IDL exception "IMP_LIMIT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:38 PM
 */

public final class IMP_LIMITHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CORBA.IMP_LIMITHelper.id(),"IMP_LIMIT",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("minor", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(5)), null),new org.omg.CORBA.StructMember("completed", org.omg.CORBA.CompletionStatusHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CORBA.IMP_LIMIT s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CORBA.IMP_LIMIT extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/IMP_LIMIT:1.0";
	}
	public static org.omg.CORBA.IMP_LIMIT read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		int x0;
		x0=in.read_ulong();
		org.omg.CORBA.CompletionStatus x1;
		x1=org.omg.CORBA.CompletionStatusHelper.read(in);
		final org.omg.CORBA.IMP_LIMIT result = new org.omg.CORBA.IMP_LIMIT(id, x0, x1);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CORBA.IMP_LIMIT s)
	{
		out.write_string(id());
		out.write_ulong(s.minor);
		org.omg.CORBA.CompletionStatusHelper.write(out,s.completed);
	}
}
