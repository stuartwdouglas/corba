package org.omg.CORBA;

/**
 * Generated from IDL alias "ExcDescriptionSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class ExcDescriptionSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.ExceptionDescription[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.ExceptionDescription[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.ExcDescriptionSeqHelper.id(), "ExcDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ExceptionDescriptionHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/ExcDescriptionSeq:1.0";
	}
	public static org.omg.CORBA.ExceptionDescription[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.ExceptionDescription[] _result;
		int _l_result18 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result18 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result18);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.ExceptionDescription[_l_result18];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.ExceptionDescriptionHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.ExceptionDescription[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.ExceptionDescriptionHelper.write(_out,_s[i]);
		}

	}
}
