package org.omg.Messaging;

/**
 * Generated from IDL struct "RoutingTypeRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class RoutingTypeRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public RoutingTypeRange(){}
	public short min;
	public short max;
	public RoutingTypeRange(short min, short max)
	{
		this.min = min;
		this.max = max;
	}
}
