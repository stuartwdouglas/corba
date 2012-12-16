package org.omg.PortableServer.POAManagerPackage;
/**
 * Generated from IDL enum "State".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class StateHolder
	implements org.omg.CORBA.portable.Streamable
{
	public State value;

	public StateHolder ()
	{
	}
	public StateHolder (final State initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return StateHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = StateHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		StateHelper.write (out,value);
	}
}
