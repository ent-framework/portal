package com.liferay.portlet.polls.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PollsVote service. Represents a row in the &quot;PollsVote&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PollsVoteModel
 * @see com.liferay.portlet.polls.model.impl.PollsVoteImpl
 * @see com.liferay.portlet.polls.model.impl.PollsVoteModelImpl
 * @generated
 */
@ProviderType
public interface PollsVote extends PollsVoteModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.polls.model.impl.PollsVoteImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.polls.model.PollsChoice getChoice()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
