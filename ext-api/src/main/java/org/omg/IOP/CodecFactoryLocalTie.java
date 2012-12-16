package org.omg.IOP;


/**
 * Generated from IDL interface "CodecFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:36 PM
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
