package com.liferay.portlet.social.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the SocialActivityCounter service. Represents a row in the &quot;SocialActivityCounter&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SocialActivityCounterModel
 * @see com.liferay.portlet.social.model.impl.SocialActivityCounterImpl
 * @see com.liferay.portlet.social.model.impl.SocialActivityCounterModelImpl
 * @generated
 */
public interface SocialActivityCounter extends SocialActivityCounterModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.social.model.impl.SocialActivityCounterImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isActivePeriod(int periodLength);
}
