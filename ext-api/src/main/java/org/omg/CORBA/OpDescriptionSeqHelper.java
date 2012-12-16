package org.omg.CORBA;

/**
 * Generated from IDL alias "OpDescriptionSeq".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class OpDescriptionSeqHelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.CORBA.OperationDescription[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.CORBA.OperationDescription[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.CORBA.OpDescriptionSeqHelper.id(), "OpDescriptionSeq",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.OperationDescriptionHelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:omg.org/CORBA/OpDescriptionSeq:1.0";
	}
	public static org.omg.CORBA.OperationDescription[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.CORBA.OperationDescription[] _result;
		int _l_result20 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result20 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result20);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new org.omg.CORBA.OperationDescription[_l_result20];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.CORBA.OperationDescriptionHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.CORBA.OperationDescription[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.CORBA.OperationDescriptionHelper.write(_out,_s[i]);
		}

	}
}
