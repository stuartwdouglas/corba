package org.omg.CosTransactions;


/**
 * Generated from IDL interface "Synchronization".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public interface SynchronizationOperations
	extends org.omg.CosTransactions.TransactionalObjectOperations
{
	/* constants */
	/* operations  */
	void before_completion();
	void after_completion(org.omg.CosTransactions.Status status_);
}
