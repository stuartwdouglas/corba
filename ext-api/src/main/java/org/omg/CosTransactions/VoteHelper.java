package org.omg.CosTransactions;
/**
 * Generated from IDL enum "Vote".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public final class VoteHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(org.omg.CosTransactions.VoteHelper.id(),"Vote",new String[]{"VoteCommit","VoteRollback","VoteReadOnly"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.CosTransactions.Vote s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.CosTransactions.Vote extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:omg.org/CosTransactions/Vote:1.0";
	}
	public static Vote read (final org.omg.CORBA.portable.InputStream in)
	{
		return Vote.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Vote s)
	{
		out.write_long(s.value());
	}
}
