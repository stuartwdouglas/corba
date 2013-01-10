package org.omg.Security;

/**
 * Generated from IDL struct "SelectorValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class SelectorValue
	implements org.omg.CORBA.portable.IDLEntity
{
	public SelectorValue(){}
	public int selector;
	public org.omg.CORBA.Any value;
	public SelectorValue(int selector, org.omg.CORBA.Any value)
	{
		this.selector = selector;
		this.value = value;
	}
}
