package org.omg.ATLAS;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AuthTokenDispenser".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:17 AM
 */

public class AuthTokenDispenserPOATie
	extends AuthTokenDispenserPOA
{
	private AuthTokenDispenserOperations _delegate;

	private POA _poa;
	public AuthTokenDispenserPOATie(AuthTokenDispenserOperations delegate)
	{
		_delegate = delegate;
	}
	public AuthTokenDispenserPOATie(AuthTokenDispenserOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.ATLAS.AuthTokenDispenser _this()
	{
		return org.omg.ATLAS.AuthTokenDispenserHelper.narrow(_this_object());
	}
	public org.omg.ATLAS.AuthTokenDispenser _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.ATLAS.AuthTokenDispenserHelper.narrow(_this_object(orb));
	}
	public AuthTokenDispenserOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AuthTokenDispenserOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public org.omg.ATLAS.AuthTokenData get_my_authorization_token() throws org.omg.ATLAS.IllegalTokenRequest
	{
		return _delegate.get_my_authorization_token();
	}

	public org.omg.ATLAS.AuthTokenData translate_authorization_token(org.omg.CSI.IdentityToken the_subject, org.omg.CSI.AuthorizationElement[] the_token) throws org.omg.ATLAS.IllegalTokenRequest,org.omg.ATLAS.TokenOkay
	{
		return _delegate.translate_authorization_token(the_subject,the_token);
	}

}
