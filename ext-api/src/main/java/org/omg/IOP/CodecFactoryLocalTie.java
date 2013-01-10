package org.omg.IOP;


/**
 * Generated from IDL interface "CodecFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class CodecFactoryLocalTie
	extends _CodecFactoryLocalBase
{
	private CodecFactoryOperations _delegate;

	public CodecFactoryLocalTie(CodecFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public CodecFactoryOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CodecFactoryOperations delegate)
	{
		_delegate = delegate;
	}
	public org.omg.IOP.Codec create_codec(org.omg.IOP.Encoding enc) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding
	{
		return _delegate.create_codec(enc);
	}

}
