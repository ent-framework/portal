package com.liferay.portlet.polls.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PollsChoice service. Represents a row in the &quot;PollsChoice&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoiceModel
 * @see com.liferay.portlet.polls.model.impl.PollsChoiceImpl
 * @see com.liferay.portlet.polls.model.impl.PollsChoiceModelImpl
 * @generated
 */
@ProviderType
public interface PollsChoice extends PollsChoiceModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.polls.model.impl.PollsChoiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public int getVotesCount()
        throws com.liferay.portal.kernel.exception.SystemException;
}
