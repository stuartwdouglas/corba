package org.omg.CORBA;

/**
 * Generated from IDL alias "ExceptionDefSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ExceptionDefSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.ExceptionDef[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.ExceptionDef[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ExceptionDefSeqHelper.id(), "ExceptionDefSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_interface_tc("IDL:omg.org/CORBA/ExceptionDef:1.0", "ExceptionDef")));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ExceptionDefSeq:1.0";
	}
	public static org.omg.CORBA.ExceptionDef[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.ExceptionDef[] _result;
		int _l_result17 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result17 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result17);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.ExceptionDef[_l_result17];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.ExceptionDefHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.ExceptionDef[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.ExceptionDefHelper.write(_out,_s[i]);
		}

	}
}
