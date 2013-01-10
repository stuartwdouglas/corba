package org.omg.CSIIOP;


/**
 * Generated from IDL struct "CompoundSecMechList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CompoundSecMechListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.CompoundSecMechListHelper.id(),"CompoundSecMechList",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("stateful", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mechanism_list", org.omg.CSIIOP.CompoundSecMechanismsHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.CompoundSecMechList s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.CompoundSecMechList extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/CompoundSecMechList:1.0";
	}
	public static org.omg.CSIIOP.CompoundSecMechList read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.CompoundSecMechList result = new org.omg.CSIIOP.CompoundSecMechList();
		result.stateful=in.read_boolean();
		result.mechanism_list = org.omg.CSIIOP.CompoundSecMechanismsHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.CompoundSecMechList s)
	{
		out.write_boolean(s.stateful);
		org.omg.CSIIOP.CompoundSecMechanismsHelper.write(out,s.mechanism_list);
	}
}
