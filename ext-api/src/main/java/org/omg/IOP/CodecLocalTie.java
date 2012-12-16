package org.omg.IOP;


/**
 * Generated from IDL interface "Codec".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
 */

public class CodecLocalTie
	extends _CodecLocalBase
{
	private CodecOperations _delegate;

	public CodecLocalTie(CodecOperations delegate)
	{
		_delegate = delegate;
	}
	public CodecOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CodecOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.CORBA.Any decode(byte[] data) throws org.omg.IOP.CodecPackage.FormatMismatch
	{
		return _delegate.decode(data);
	}

	public org.omg.CORBA.Any decode_value(byte[] data, org.omg.CORBA.TypeCode tc) throws org.omg.IOP.CodecPackage.TypeMismatch,org.omg.IOP.CodecPackage.FormatMismatch
	{
		return _delegate.decode_value(data,tc);
	}

	public byte[] encode_value(org.omg.CORBA.Any data) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding
	{
		return _delegate.encode_value(data);
	}

	public byte[] encode(org.omg.CORBA.Any data) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding
	{
		return _delegate.encode(data);
	}

}
