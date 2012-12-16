package org.omg.CosNaming;
/**
 * Generated from IDL enum "BindingType".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:39 PM
 */

public final class BindingType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _nobject = 0;
	public static final BindingType nobject = new BindingType(_nobject);
	public static final int _ncontext = 1;
	public static final BindingType ncontext = new BindingType(_ncontext);
	public int value()
	{
		return value;
	}
	public static BindingType from_int(int value)
	{
		switch (value) {
			case _nobject: return nobject;
			case _ncontext: return ncontext;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _nobject: return "nobject";
			case _ncontext: return "ncontext";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected BindingType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
