package org.omg.CSI;

/**
 * Generated from IDL alias "GSS_NT_ExportedNameList".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class GSS_NT_ExportedNameListHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, byte[][] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static byte[][] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CSI.GSS_NT_ExportedNameListHelper.id(), "GSS_NT_ExportedNameList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CSI.GSS_NT_ExportedNameHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CSI/GSS_NT_ExportedNameList:1.0";
	}
	public static byte[][] read (final org.omg.CORBA.portable.InputStream _in)
	{
		byte[][] _result;
		int _l_result86 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result86 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result86);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new byte[_l_result86][];
		for (int i=0;i<_result.length;i++)
		{
			_result[i] = org.omg.CSI.GSS_NT_ExportedNameHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, byte[][] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CSI.GSS_NT_ExportedNameHelper.write(_out,_s[i]);
		}

	}
}
