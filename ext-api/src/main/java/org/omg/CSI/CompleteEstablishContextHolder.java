package org.omg.CSI;

/**
 * Generated from IDL struct "CompleteEstablishContext".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class CompleteEstablishContextHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CSI.CompleteEstablishContext value;

	public CompleteEstablishContextHolder ()
	{
	}
	public CompleteEstablishContextHolder(final org.omg.CSI.CompleteEstablishContext initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CSI.CompleteEstablishContextHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CSI.CompleteEstablishContextHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CSI.CompleteEstablishContextHelper.write(_out, value);
	}
}
