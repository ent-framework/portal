package com.liferay.mail.model.impl;

/**
 * The extended model implementation for the CyrusUser service. Represents a row in the &quot;Mail_CyrusUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.mail.model.CyrusUser} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class CyrusUserImpl extends CyrusUserBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a cyrus user model instance should use the {@link com.liferay.mail.model.CyrusUser} interface instead.
     */
    public CyrusUserImpl() {
    }

    public CyrusUserImpl(String userId, String password) {
        this.setUserId(userId);
        this.setPassword(password);
    }

}
