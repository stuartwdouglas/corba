package org.omg.PortableServer;
/**
 * Generated from IDL enum "ThreadPolicyValue".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:12:39 PM
 */

public final class ThreadPolicyValue
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ORB_CTRL_MODEL = 0;
	public static final ThreadPolicyValue ORB_CTRL_MODEL = new ThreadPolicyValue(_ORB_CTRL_MODEL);
	public static final int _SINGLE_THREAD_MODEL = 1;
	public static final ThreadPolicyValue SINGLE_THREAD_MODEL = new ThreadPolicyValue(_SINGLE_THREAD_MODEL);
	public static final int _MAIN_THREAD_MODEL = 2;
	public static final ThreadPolicyValue MAIN_THREAD_MODEL = new ThreadPolicyValue(_MAIN_THREAD_MODEL);
	public int value()
	{
		return value;
	}
	public static ThreadPolicyValue from_int(int value)
	{
		switch (value) {
			case _ORB_CTRL_MODEL: return ORB_CTRL_MODEL;
			case _SINGLE_THREAD_MODEL: return SINGLE_THREAD_MODEL;
			case _MAIN_THREAD_MODEL: return MAIN_THREAD_MODEL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ORB_CTRL_MODEL: return "ORB_CTRL_MODEL";
			case _SINGLE_THREAD_MODEL: return "SINGLE_THREAD_MODEL";
			case _MAIN_THREAD_MODEL: return "MAIN_THREAD_MODEL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ThreadPolicyValue(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
