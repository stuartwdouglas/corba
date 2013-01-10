package org.omg.CSI;

/**
 * Generated from IDL struct "AuthorizationElement".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class AuthorizationElement
	implements org.omg.CORBA.portable.IDLEntity
{
	public AuthorizationElement(){}
	public int the_type;
	public byte[] the_element;
	public AuthorizationElement(int the_type, byte[] the_element)
	{
		this.the_type = the_type;
		this.the_element = the_element;
	}
}
