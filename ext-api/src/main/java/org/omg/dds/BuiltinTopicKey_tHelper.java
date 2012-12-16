package org.omg.dds;
public final class BuiltinTopicKey_tHelper
{
	private static org.omg.CORBA.TypeCode _type = org.omg.CORBA.ORB.init().create_array_tc(3,org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)));
	public static void insert (final org.omg.CORBA.Any any, final int[] s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static int[] extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static org.omg.CORBA.TypeCode type()
	{
		return _type;
	}
	public static String id()
	{
		return "IDL:omg.org/dds/BuiltinTopicKey_t:1.0";
	}
	public static int[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		int[] result = new int[3]; // int[]
		_in.read_long_array(result,0,3);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final int[] s)
	{
		if (s.length != 3)
			throw new org.omg.CORBA.MARSHAL("Incorrect array size");
		out.write_long_array(s,0,3);
	}
}
