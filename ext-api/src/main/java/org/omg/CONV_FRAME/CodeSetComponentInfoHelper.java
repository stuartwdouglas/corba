package org.omg.CONV_FRAME;


/**
 * Generated from IDL struct "CodeSetComponentInfo".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class CodeSetComponentInfoHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CONV_FRAME.CodeSetComponentInfoHelper.id(),"CodeSetComponentInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ForCharData", org.omg.CONV_FRAME.CodeSetComponentHelper.type(), null),new org.omg.CORBA.StructMember("ForWcharData", org.omg.CONV_FRAME.CodeSetComponentHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CONV_FRAME.CodeSetComponentInfo s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CONV_FRAME.CodeSetComponentInfo extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CONV_FRAME/CodeSetComponentInfo:1.0";
	}
	public static org.omg.CONV_FRAME.CodeSetComponentInfo read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CONV_FRAME.CodeSetComponentInfo result = new org.omg.CONV_FRAME.CodeSetComponentInfo();
		result.ForCharData=org.omg.CONV_FRAME.CodeSetComponentHelper.read(in);
		result.ForWcharData=org.omg.CONV_FRAME.CodeSetComponentHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CONV_FRAME.CodeSetComponentInfo s)
	{
		org.omg.CONV_FRAME.CodeSetComponentHelper.write(out,s.ForCharData);
		org.omg.CONV_FRAME.CodeSetComponentHelper.write(out,s.ForWcharData);
	}
}
