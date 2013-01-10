package org.omg.ATLAS;

/**
 * Generated from IDL alias "IdTokenOption".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class IdTokenOptionHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CSI.IdentityToken[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CSI.IdentityToken[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.ATLAS.IdTokenOptionHelper.id(), "IdTokenOption",org.omg.CORBA.ORB.init().create_sequence_tc(1, org.omg.CSI.IdentityTokenHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/ATLAS/IdTokenOption:1.0";
	}
	public static org.omg.CSI.IdentityToken[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CSI.IdentityToken[] _result;
		int _l_result95 = _in.read_long();
		if (_l_result95 > 1)
			throw new org.omg.CORBA.MARSHAL("Sequence length incorrect!");
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result95 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result95);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CSI.IdentityToken[_l_result95];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CSI.IdentityTokenHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CSI.IdentityToken[] _s)
	{
				if (_s.length > 1)
			throw new org.omg.CORBA.MARSHAL("Incorrect sequence length");
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CSI.IdentityTokenHelper.write(_out,_s[i]);
		}

	}
}
