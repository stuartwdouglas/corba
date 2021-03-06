package org.omg.CosCollection;


/**
 * Generated from IDL interface "CollectionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:20 AM
 */

public class _CollectionFactoryStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.CosCollection.CollectionFactory
{
	private String[] ids = {"IDL:omg.org/CosCollection/CollectionFactory:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.CosCollection.CollectionFactoryOperations.class;
	public org.omg.CosCollection.Collection generic_create(org.omg.CosCollection.NVPair[] parameters) throws org.omg.CosCollection.ParameterInvalid
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			org.omg.CORBA.portable.OutputStream _os = null;
			try
			{
				_os = _request( "generic_create", true);
				org.omg.CosCollection.ParameterListHelper.write(_os,parameters);
				_is = _invoke(_os);
				org.omg.CosCollection.Collection _result = org.omg.CosCollection.CollectionHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				try
				{
					if( _id.equals("IDL:omg.org/CosCollection/ParameterInvalid:1.0"))
					{
						throw org.omg.CosCollection.ParameterInvalidHelper.read(_ax.getInputStream());
					}
					else 
					{
						throw new RuntimeException("Unexpected exception " + _id );
					}
				}
				finally
				{
				try
				{
					_ax.getInputStream().close();
				}
				catch (java.io.IOException e)
				{
					throw new RuntimeException("Unexpected exception " + e.toString() );
				}
			}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
					throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "generic_create", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionFactoryOperations _localServant = (CollectionFactoryOperations)_so.servant;
			org.omg.CosCollection.Collection _result;
			try
			{
				_result = _localServant.generic_create(parameters);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

}
