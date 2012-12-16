package org.omg.CSI;

/**
 * Generated from IDL union "SASContextBody".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:40 PM
 */

public final class SASContextBody
	implements org.omg.CORBA.portable.IDLEntity
{
	private short discriminator;
	private org.omg.CSI.EstablishContext establish_msg;
	private org.omg.CSI.CompleteEstablishContext complete_msg;
	private org.omg.CSI.ContextError error_msg;
	private org.omg.CSI.MessageInContext in_context_msg;

	public SASContextBody ()
	{
	}

	public short discriminator ()
	{
		return discriminator;
	}

	public org.omg.CSI.EstablishContext establish_msg ()
	{
		if (discriminator != 0)
			throw new org.omg.CORBA.BAD_OPERATION();
		return establish_msg;
	}

	public void establish_msg (org.omg.CSI.EstablishContext _x)
	{
		discriminator = 0;
		establish_msg = _x;
	}

	public org.omg.CSI.CompleteEstablishContext complete_msg ()
	{
		if (discriminator != 1)
			throw new org.omg.CORBA.BAD_OPERATION();
		return complete_msg;
	}

	public void complete_msg (org.omg.CSI.CompleteEstablishContext _x)
	{
		discriminator = 1;
		complete_msg = _x;
	}

	public org.omg.CSI.ContextError error_msg ()
	{
		if (discriminator != 4)
			throw new org.omg.CORBA.BAD_OPERATION();
		return error_msg;
	}

	public void error_msg (org.omg.CSI.ContextError _x)
	{
		discriminator = 4;
		error_msg = _x;
	}

	public org.omg.CSI.MessageInContext in_context_msg ()
	{
		if (discriminator != 5)
			throw new org.omg.CORBA.BAD_OPERATION();
		return in_context_msg;
	}

	public void in_context_msg (org.omg.CSI.MessageInContext _x)
	{
		discriminator = 5;
		in_context_msg = _x;
	}

	public void __default ()
	{
		discriminator = 2;
	}
	public void __default (short _discriminator)
	{
		discriminator = _discriminator;
	}
}
