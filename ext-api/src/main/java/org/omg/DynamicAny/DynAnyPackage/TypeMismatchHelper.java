package org.omg.DynamicAny.DynAnyPackage;


/**
 * Generated from IDL exception "TypeMismatch".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:34 PM
 */

public final class TypeMismatchHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.id(),"TypeMismatch",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.DynamicAny.DynAnyPackage.TypeMismatch s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.DynamicAny.DynAnyPackage.TypeMismatch extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/DynamicAny/DynAny/TypeMismatch:1.0";
	}
	public static org.omg.DynamicAny.DynAnyPackage.TypeMismatch read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.DynamicAny.DynAnyPackage.TypeMismatch result = new org.omg.DynamicAny.DynAnyPackage.TypeMismatch(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.DynamicAny.DynAnyPackage.TypeMismatch s)
	{
		out.write_string(id());
	}
}
