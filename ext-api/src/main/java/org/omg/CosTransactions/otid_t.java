package org.omg.CosTransactions;

/**
 * Generated from IDL struct "otid_t".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:19 AM
 */

public final class otid_t
	implements org.omg.CORBA.portable.IDLEntity
{
	public otid_t(){}
	public int formatID;
	public int bqual_length;
	public byte[] tid;
	public otid_t(int formatID, int bqual_length, byte[] tid)
	{
		this.formatID = formatID;
		this.bqual_length = bqual_length;
		this.tid = tid;
	}
}
