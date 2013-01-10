package org.omg.CosTransactions;


/**
 * Generated from IDL exception "SubtransactionsUnavailable".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class SubtransactionsUnavailableHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_exception_tc(org.omg.CosTransactions.SubtransactionsUnavailableHelper.id(),"SubtransactionsUnavailable",new org.omg.CORBA.StructMember[0]);
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.SubtransactionsUnavailable s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTransactions.SubtransactionsUnavailable extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTransactions/SubtransactionsUnavailable:1.0";
	}
	public static org.omg.CosTransactions.SubtransactionsUnavailable read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final org.omg.CosTransactions.SubtransactionsUnavailable result = new org.omg.CosTransactions.SubtransactionsUnavailable(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.CosTransactions.SubtransactionsUnavailable s)
	{
		out.write_string(id());
	}
}
