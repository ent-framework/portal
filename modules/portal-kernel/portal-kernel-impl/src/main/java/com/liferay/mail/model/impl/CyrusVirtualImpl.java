package com.liferay.mail.model.impl;


/**
 * The extended model implementation for the CyrusVirtual service. Represents a row in the &quot;Mail_CyrusVirtual&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.mail.model.CyrusVirtual} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class CyrusVirtualImpl extends CyrusVirtualBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a cyrus virtual model instance should use the {@link com.liferay.mail.model.CyrusVirtual} interface instead.
     */
    public CyrusVirtualImpl() {
    }

    public CyrusVirtualImpl(String emailAddress, String userId) {
        this.setEmailAddress(emailAddress);
        this.setUserId(userId);
    }
}
