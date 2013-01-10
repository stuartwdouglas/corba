package org.omg.CosTime;
/**
 * Generated from IDL enum "OverlapType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class OverlapTypeHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosTime.OverlapTypeHelper.id(),"OverlapType",new String[]{"OTContainer","OTContained","OTOverlap","OTNoOverlap"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTime.OverlapType s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTime.OverlapType extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:CosTime/OverlapType:1.0";
	}
	public static OverlapType read (final org.omg.CORBA.portable.InputStream in)
	{
		return OverlapType.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final OverlapType s)
	{
		out.write_long(s.value());
	}
}
