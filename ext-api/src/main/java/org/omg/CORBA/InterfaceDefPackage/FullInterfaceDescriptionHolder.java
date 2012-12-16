package org.omg.CORBA.InterfaceDefPackage;

/**
 * Generated from IDL struct "FullInterfaceDescription".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:32 PM
 */

public final class FullInterfaceDescriptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription value;

	public FullInterfaceDescriptionHolder ()
	{
	}
	public FullInterfaceDescriptionHolder(final org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescriptionHelper.write(_out, value);
	}
}
