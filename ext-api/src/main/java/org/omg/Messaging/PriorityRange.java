package org.omg.Messaging;

/**
 * Generated from IDL struct "PriorityRange".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public final class PriorityRange
	implements org.omg.CORBA.portable.IDLEntity
{
	public PriorityRange(){}
	public short min;
	public short max;
	public PriorityRange(short min, short max)
	{
		this.min = min;
		this.max = max;
	}
}
