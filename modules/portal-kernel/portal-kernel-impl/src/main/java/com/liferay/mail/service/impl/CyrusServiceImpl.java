package com.liferay.mail.service.impl;

import com.liferay.mail.NoSuchCyrusUserException;
import com.liferay.mail.model.CyrusUser;
import com.liferay.mail.model.CyrusVirtual;
import com.liferay.mail.model.impl.CyrusUserImpl;
import com.liferay.mail.model.impl.CyrusVirtualImpl;
import com.liferay.mail.service.base.CyrusServiceBaseImpl;
import com.liferay.mail.service.persistence.CyrusUserUtil;
import com.liferay.mail.service.persistence.CyrusVirtualUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the cyrus remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.mail.service.CyrusService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.mail.service.base.CyrusServiceBaseImpl
 * @see com.liferay.mail.service.CyrusServiceUtil
 */
public class CyrusServiceImpl extends CyrusServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.mail.service.CyrusServiceUtil} to access the cyrus remote service.
     */
    public void addUser(long userId, String emailAddress, String password)
            throws SystemException {

        CyrusUser cyrusUser = new CyrusUserImpl(""+ userId, password);

        this.getCyrusUserPersistence().update(cyrusUser);

       // CyrusUserUtil.update(cyrusUser);

        CyrusVirtual cyrusVirtual = new CyrusVirtualImpl(emailAddress, "" + userId);

        this.getCyrusVirtualPersistence().update(cyrusVirtual);

       // CyrusVirtualUtil.update(cyrusVirtual);
    }

    public void deleteEmailAddress(long companyId, long userId)
            throws SystemException {

        //this.getCyrusVirtualPersistence().remove()
       // CyrusVirtualUtil.removeByUserId(userId);
    }

    public void deleteUser(long userId) throws SystemException {
//        try {
//            CyrusUserUtil.remove(userId);
//        }
//        catch (NoSuchCyrusUserException nscue) {
//        }
//
//        CyrusVirtualUtil.removeByUserId(userId);
    }

    public void updateEmailAddress(
            long companyId, long userId, String emailAddress)
            throws SystemException {

//        CyrusVirtualUtil.removeByUserId(userId);
//
//        CyrusVirtual cyrusVirtual = new CyrusVirtual(emailAddress, userId);
//
//        CyrusVirtualUtil.update(cyrusVirtual);
    }

    public void updatePassword(long companyId, long userId, String password)
            throws SystemException {

        CyrusUser cyrusUser = null;

        try {
            cyrusUser = CyrusUserUtil.findByPrimaryKey("" + userId);
        }
        catch (NoSuchCyrusUserException nscue) {
            cyrusUser = new CyrusUserImpl("" + userId, password);
        }

        cyrusUser.setPassword(password);
        this.getCyrusUserPersistence().update(cyrusUser);
       // CyrusUserUtil.update(cyrusUser);
    }
}
