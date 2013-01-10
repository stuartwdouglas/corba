package org.omg.dds;


/**
 * Generated from IDL struct "OwnershipStrengthQosPolicy".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class OwnershipStrengthQosPolicyHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.dds.OwnershipStrengthQosPolicyHelper.id(),"OwnershipStrengthQosPolicy",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.dds.OwnershipStrengthQosPolicy s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.dds.OwnershipStrengthQosPolicy extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/dds/OwnershipStrengthQosPolicy:1.0";
	}
	public static org.omg.dds.OwnershipStrengthQosPolicy read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.dds.OwnershipStrengthQosPolicy result = new org.omg.dds.OwnershipStrengthQosPolicy();
		result.value=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.dds.OwnershipStrengthQosPolicy s)
	{
		out.write_long(s.value);
	}
}
