package org.omg.Security;
/**
 * Generated from IDL enum "QOP".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public final class QOP
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SecQOPNoProtection = 0;
	public static final QOP SecQOPNoProtection = new QOP(_SecQOPNoProtection);
	public static final int _SecQOPIntegrity = 1;
	public static final QOP SecQOPIntegrity = new QOP(_SecQOPIntegrity);
	public static final int _SecQOPConfidentiality = 2;
	public static final QOP SecQOPConfidentiality = new QOP(_SecQOPConfidentiality);
	public static final int _SecQOPIntegrityAndConfidentiality = 3;
	public static final QOP SecQOPIntegrityAndConfidentiality = new QOP(_SecQOPIntegrityAndConfidentiality);
	public int value()
	{
		return value;
	}
	public static QOP from_int(int value)
	{
		switch (value) {
			case _SecQOPNoProtection: return SecQOPNoProtection;
			case _SecQOPIntegrity: return SecQOPIntegrity;
			case _SecQOPConfidentiality: return SecQOPConfidentiality;
			case _SecQOPIntegrityAndConfidentiality: return SecQOPIntegrityAndConfidentiality;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SecQOPNoProtection: return "SecQOPNoProtection";
			case _SecQOPIntegrity: return "SecQOPIntegrity";
			case _SecQOPConfidentiality: return "SecQOPConfidentiality";
			case _SecQOPIntegrityAndConfidentiality: return "SecQOPIntegrityAndConfidentiality";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected QOP(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
