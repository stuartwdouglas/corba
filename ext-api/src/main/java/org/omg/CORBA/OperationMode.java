package org.omg.CORBA;
/**
 * Generated from IDL enum "OperationMode".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:10 AM
 */

public final class OperationMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _OP_NORMAL = 0;
	public static final OperationMode OP_NORMAL = new OperationMode(_OP_NORMAL);
	public static final int _OP_ONEWAY = 1;
	public static final OperationMode OP_ONEWAY = new OperationMode(_OP_ONEWAY);
	public int value()
	{
		return value;
	}
	public static OperationMode from_int(int value)
	{
		switch (value) {
			case _OP_NORMAL: return OP_NORMAL;
			case _OP_ONEWAY: return OP_ONEWAY;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _OP_NORMAL: return "OP_NORMAL";
			case _OP_ONEWAY: return "OP_ONEWAY";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected OperationMode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
