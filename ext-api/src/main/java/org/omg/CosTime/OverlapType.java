package org.omg.CosTime;
/**
 * Generated from IDL enum "OverlapType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public final class OverlapType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _OTContainer = 0;
	public static final OverlapType OTContainer = new OverlapType(_OTContainer);
	public static final int _OTContained = 1;
	public static final OverlapType OTContained = new OverlapType(_OTContained);
	public static final int _OTOverlap = 2;
	public static final OverlapType OTOverlap = new OverlapType(_OTOverlap);
	public static final int _OTNoOverlap = 3;
	public static final OverlapType OTNoOverlap = new OverlapType(_OTNoOverlap);
	public int value()
	{
		return value;
	}
	public static OverlapType from_int(int value)
	{
		switch (value) {
			case _OTContainer: return OTContainer;
			case _OTContained: return OTContained;
			case _OTOverlap: return OTOverlap;
			case _OTNoOverlap: return OTNoOverlap;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _OTContainer: return "OTContainer";
			case _OTContained: return "OTContained";
			case _OTOverlap: return "OTOverlap";
			case _OTNoOverlap: return "OTNoOverlap";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected OverlapType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
