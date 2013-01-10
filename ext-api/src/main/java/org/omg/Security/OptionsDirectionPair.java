package org.omg.Security;

/**
 * Generated from IDL struct "OptionsDirectionPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class OptionsDirectionPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public OptionsDirectionPair(){}
	public short options;
	public org.omg.Security.CommunicationDirection direction;
	public OptionsDirectionPair(short options, org.omg.Security.CommunicationDirection direction)
	{
		this.options = options;
		this.direction = direction;
	}
}
