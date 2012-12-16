package org.omg.CSIIOP;


/**
 * Generated from IDL struct "CompoundSecMech".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class CompoundSecMechHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CSIIOP.CompoundSecMechHelper.id(),"CompoundSecMech",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("target_requires", org.omg.CSIIOP.AssociationOptionsHelper.type(), null),new org.omg.CORBA.StructMember("transport_mech", org.omg.IOP.TaggedComponentHelper.type(), null),new org.omg.CORBA.StructMember("as_context_mech", org.omg.CSIIOP.AS_ContextSecHelper.type(), null),new org.omg.CORBA.StructMember("sas_context_mech", org.omg.CSIIOP.SAS_ContextSecHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CSIIOP.CompoundSecMech s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CSIIOP.CompoundSecMech extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CSIIOP/CompoundSecMech:1.0";
	}
	public static org.omg.CSIIOP.CompoundSecMech read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CSIIOP.CompoundSecMech result = new org.omg.CSIIOP.CompoundSecMech();
		result.target_requires=in.read_ushort();
		result.transport_mech=org.omg.IOP.TaggedComponentHelper.read(in);
		result.as_context_mech=org.omg.CSIIOP.AS_ContextSecHelper.read(in);
		result.sas_context_mech=org.omg.CSIIOP.SAS_ContextSecHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CSIIOP.CompoundSecMech s)
	{
		out.write_ushort(s.target_requires);
		org.omg.IOP.TaggedComponentHelper.write(out,s.transport_mech);
		org.omg.CSIIOP.AS_ContextSecHelper.write(out,s.as_context_mech);
		org.omg.CSIIOP.SAS_ContextSecHelper.write(out,s.sas_context_mech);
	}
}
