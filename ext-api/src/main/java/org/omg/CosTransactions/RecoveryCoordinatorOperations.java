package org.omg.CosTransactions;


/**
 * Generated from IDL interface "RecoveryCoordinator".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public interface RecoveryCoordinatorOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Status replay_completion(org.omg.CosTransactions.Resource r) throws org.omg.CosTransactions.NotPrepared;
}
