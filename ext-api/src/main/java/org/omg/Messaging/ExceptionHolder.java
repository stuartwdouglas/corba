package org.omg.Messaging;

/**
 * Generated from IDL valuetype "ExceptionHolder".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public abstract class ExceptionHolder
	implements org.omg.CORBA.portable.StreamableValue
{
	private String[] _truncatable_ids = {"IDL:omg.org/Messaging/ExceptionHolder:1.0"};
	protected boolean is_system_exception;
	protected boolean byte_order;
	protected byte[] marshaled_exception;
	public abstract void raise_exception() throws org.omg.CORBA.UserException;

	public abstract void raise_exception_with_list(org.omg.CORBA.ExceptionList exc_list) throws org.omg.CORBA.UserException;

	public void _write (org.omg.CORBA.portable.OutputStream os)
	{
		os.write_boolean(is_system_exception);
		os.write_boolean(byte_order);
		
		os.write_long(marshaled_exception.length);
		os.write_octet_array(marshaled_exception,0,marshaled_exception.length);
	}

	public void _read (final org.omg.CORBA.portable.InputStream os)
	{
		is_system_exception=os.read_boolean();
		byte_order=os.read_boolean();
		int _lmarshaled_exception62 = os.read_long();
		try
		{
			 int x = os.available();
			 if ( x > 0 && _lmarshaled_exception62 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _lmarshaled_exception62);
				}
		}
		catch (java.io.IOException e)
		{
		}
		marshaled_exception = new byte[_lmarshaled_exception62];
		os.read_octet_array(marshaled_exception,0,_lmarshaled_exception62);
	}

	public String[] _truncatable_ids()
	{
		return _truncatable_ids;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return org.omg.Messaging.ExceptionHolderHelper.type();
	}
}
