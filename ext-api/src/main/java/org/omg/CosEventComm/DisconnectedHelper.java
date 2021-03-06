package org.omg.CosEventComm;


/**
 * Generated from IDL exception "Disconnected".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DisconnectedHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosEventComm.DisconnectedHelper.id(),"Disconnected",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosEventComm.Disconnected s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosEventComm.Disconnected extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosEventComm/Disconnected:1.0";
	}
	public static org.omg.CosEventComm.Disconnected read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosEventComm.Disconnected result = new org.omg.CosEventComm.Disconnected(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosEventComm.Disconnected s)
	{
		out.write_string(id());
	}
}
