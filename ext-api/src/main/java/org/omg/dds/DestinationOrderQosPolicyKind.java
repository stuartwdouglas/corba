package org.omg.dds;
/**
 * Generated from IDL enum "DestinationOrderQosPolicyKind".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:18 AM
 */

public final class DestinationOrderQosPolicyKind
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS = 0;
	public static final DestinationOrderQosPolicyKind BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS = new DestinationOrderQosPolicyKind(_BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS);
	public static final int _BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS = 1;
	public static final DestinationOrderQosPolicyKind BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS = new DestinationOrderQosPolicyKind(_BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS);
	public int value()
	{
		return value;
	}
	public static DestinationOrderQosPolicyKind from_int(int value)
	{
		switch (value) {
			case _BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS: return BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS;
			case _BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS: return BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS: return "BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS";
			case _BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS: return "BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected DestinationOrderQosPolicyKind(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
