package org.omg.CosTransactions;


/**
 * Generated from IDL interface "SubtransactionAwareResource".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public interface SubtransactionAwareResourceOperations
	extends org.omg.CosTransactions.ResourceOperations
{
	/* constants */
	/* operations  */
	void commit_subtransaction(org.omg.CosTransactions.Coordinator parent);
	void rollback_subtransaction();
}
