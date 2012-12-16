package org.omg.TimeBase;

/**
 * Generated from IDL struct "UtcT".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:37 PM
 */

public final class UtcT
	implements org.omg.CORBA.portable.IDLEntity
{
	public UtcT(){}
	public long time;
	public int inacclo;
	public short inacchi;
	public short tdf;
	public UtcT(long time, int inacclo, short inacchi, short tdf)
	{
		this.time = time;
		this.inacclo = inacclo;
		this.inacchi = inacchi;
		this.tdf = tdf;
	}
}
