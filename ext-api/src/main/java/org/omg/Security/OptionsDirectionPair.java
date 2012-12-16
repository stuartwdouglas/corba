package org.omg.Security;

/**
 * Generated from IDL struct "OptionsDirectionPair".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
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
