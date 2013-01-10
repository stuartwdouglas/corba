package org.omg.ETF;


/**
 * Generated from IDL interface "Profile".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public class ProfileLocalTie
	extends _ProfileLocalBase
{
	private ProfileOperations _delegate;

	public ProfileLocalTie(ProfileOperations delegate)
	{
		_delegate = delegate;
	}
	public ProfileOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProfileOperations delegate)
	{
		_delegate = delegate;
	}
	public void marshal(org.omg.IOP.TaggedProfileHolder tagged_profile, org.omg.IOP.TaggedComponentSeqHolder components)
	{
_delegate.marshal(tagged_profile,components);
	}

	public byte[] get_object_key()
	{
		return _delegate.get_object_key();
	}

	public void set_object_key(byte[] key)
	{
_delegate.set_object_key(key);
	}

	public org.omg.ETF.Profile copy()
	{
		return _delegate.copy();
	}

	public org.omg.GIOP.Version version()
	{
		return _delegate.version();
	}

	public boolean is_match(org.omg.ETF.Profile prof)
	{
		return _delegate.is_match(prof);
	}

	public int tag()
	{
		return _delegate.tag();
	}

	public int hash()
	{
		return _delegate.hash();
	}

}
