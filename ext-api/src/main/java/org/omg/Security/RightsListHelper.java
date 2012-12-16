package org.omg.Security;

/**
 * Generated from IDL alias "RightsList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class RightsListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.Security.Right[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.Security.Right[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.Security.RightsListHelper.id(), "RightsList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.Security.RightHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/Security/RightsList:1.0";
	}
	public static org.omg.Security.Right[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.Security.Right[] _result;
		int _l_result73 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result73 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result73);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.Security.Right[_l_result73];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.Security.RightHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.Security.Right[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.Security.RightHelper.write(_out,_s[i]);
		}

	}
}
