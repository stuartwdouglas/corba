package org.omg.CosTransactions;


/**
 * Generated from IDL struct "TransIdentity".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class TransIdentityHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.CosTransactions.TransIdentityHelper.id(),"TransIdentity",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("coord", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTransactions/Coordinator:1.0", "Coordinator"), null),new org.omg.CORBA.StructMember("term", org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CosTransactions/Terminator:1.0", "Terminator"), null),new org.omg.CORBA.StructMember("otid", org.omg.CosTransactions.otid_tHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.TransIdentity s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTransactions.TransIdentity extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTransactions/TransIdentity:1.0";
	}
	public static org.omg.CosTransactions.TransIdentity read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.CosTransactions.TransIdentity result = new org.omg.CosTransactions.TransIdentity();
		result.coord=org.omg.CosTransactions.CoordinatorHelper.read(in);
		result.term=org.omg.CosTransactions.TerminatorHelper.read(in);
		result.otid=org.omg.CosTransactions.otid_tHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTransactions.TransIdentity s)
	{
		org.omg.CosTransactions.CoordinatorHelper.write(out,s.coord);
		org.omg.CosTransactions.TerminatorHelper.write(out,s.term);
		org.omg.CosTransactions.otid_tHelper.write(out,s.otid);
	}
}
