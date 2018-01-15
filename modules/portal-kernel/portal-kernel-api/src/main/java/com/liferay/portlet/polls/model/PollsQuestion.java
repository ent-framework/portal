package com.liferay.portlet.polls.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the PollsQuestion service. Represents a row in the &quot;PollsQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PollsQuestionModel
 * @see com.liferay.portlet.polls.model.impl.PollsQuestionImpl
 * @see com.liferay.portlet.polls.model.impl.PollsQuestionModelImpl
 * @generated
 */
public interface PollsQuestion extends PollsQuestionModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.polls.model.impl.PollsQuestionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.polls.model.PollsChoice> getChoices()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.polls.model.PollsVote> getVotes()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.polls.model.PollsVote> getVotes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int getVotesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isExpired();

    public boolean isExpired(
        com.liferay.portal.service.ServiceContext serviceContext,
        java.util.Date defaultCreateDate);
}
