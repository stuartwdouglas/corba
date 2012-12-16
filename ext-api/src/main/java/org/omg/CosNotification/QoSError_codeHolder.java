package org.omg.CosNotification;
/**
 * Generated from IDL enum "QoSError_code".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public final class QoSError_codeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public QoSError_code value;

	public QoSError_codeHolder ()
	{
	}
	public QoSError_codeHolder (final QoSError_code initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return QoSError_codeHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QoSError_codeHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		QoSError_codeHelper.write (out,value);
	}
}
