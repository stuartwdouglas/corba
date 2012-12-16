package org.omg.CosNaming;

/**
 * Generated from IDL alias "Name".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class NameHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CosNaming.NameComponent[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CosNaming.NameComponent[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CosNaming.NameHelper.id(), "Name",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CosNaming.NameComponentHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CosNaming/Name:1.0";
	}
	public static org.omg.CosNaming.NameComponent[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CosNaming.NameComponent[] _result;
		int _l_result65 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result65 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result65);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CosNaming.NameComponent[_l_result65];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CosNaming.NameComponentHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CosNaming.NameComponent[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CosNaming.NameComponentHelper.write(_out,_s[i]);
		}

	}
}
